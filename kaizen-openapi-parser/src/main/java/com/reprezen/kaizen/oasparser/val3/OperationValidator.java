/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.reprezen.kaizen.oasparser.val3;

import static com.reprezen.kaizen.oasparser.val.Messages.m;

import com.google.inject.Inject;
import com.reprezen.kaizen.oasparser.model3.Callback;
import com.reprezen.kaizen.oasparser.model3.ExternalDocs;
import com.reprezen.kaizen.oasparser.model3.Operation;
import com.reprezen.kaizen.oasparser.model3.Parameter;
import com.reprezen.kaizen.oasparser.model3.RequestBody;
import com.reprezen.kaizen.oasparser.model3.Response;
import com.reprezen.kaizen.oasparser.model3.SecurityRequirement;
import com.reprezen.kaizen.oasparser.model3.Server;
import com.reprezen.kaizen.oasparser.val.ObjectValidatorBase;
import com.reprezen.kaizen.oasparser.val.ValidationResults;
import com.reprezen.kaizen.oasparser.val.Validator;

public class OperationValidator extends ObjectValidatorBase<Operation> {

    @Inject
    private Validator<ExternalDocs> externalDocsValidator;
    @Inject
    private Validator<Parameter> parameterValidator;
    @Inject
    private Validator<RequestBody> requestBodyValidator;
    @Inject
    private Validator<Response> responseValidator;
    @Inject
    private Validator<Callback> callbackValidator;
    @Inject
    private Validator<SecurityRequirement> securityRequirementValidator;
    @Inject
    private Validator<Server> serverValidator;

    @Override
    public void validateObject(Operation operation, ValidationResults results) {
        // no validation for: tags, description, deprecated
        checkSummaryLength(operation, results);
        validateField(operation.getExternalDocs(false), results, false, "externalDocs", externalDocsValidator);
        // TODO Q: Not marked as required in spec, but spec says they all must be unique within the API. Seems like it
        // should be required.
        validateString(operation.getOperationId(false), results, false, "operationId");
        validateList(operation.getParameters(false), operation.hasParameters(), results, false, "parameters",
                parameterValidator);
        validateField(operation.getRequestBody(false), results, false, "requestBody", requestBodyValidator);
        validateMap(operation.getResponses(false), results, true, "responses", Regexes.RESPONSE_REGEX, responseValidator);
        validateMap(operation.getCallbacks(false), results, false, "callbacks", Regexes.NOEXT_REGEX, callbackValidator);
        validateList(operation.getSecurityRequirements(false), operation.hasSecurityRequirements(), results, false,
                "security", securityRequirementValidator);
        validateList(operation.getServers(false), operation.hasServers(), results, false, "servers", serverValidator);
    }

    private void checkSummaryLength(Operation operation, ValidationResults results) {
        String summary = operation.getSummary(false);
        if (summary != null && summary.length() > 120) {
            results.addWarning(m.msg("LongSummary|Sumamry exceeds recommended limit of 120 chars"), "summary");
        }
    }
}
