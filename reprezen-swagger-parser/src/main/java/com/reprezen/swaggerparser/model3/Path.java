package com.reprezen.swaggerparser.model3;

import com.reprezen.swaggerparser.model3.Operation;
import com.reprezen.swaggerparser.model3.Parameter;
import com.reprezen.swaggerparser.model3.Server;
import com.reprezen.swaggerparser.model3.SwaggerObject;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Generated;

public interface Path extends SwaggerObject {

    // Summary
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    String getSummary();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setSummary(String summary);

    // Description
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    String getDescription();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setDescription(String description);

    // Operation
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Map<String, ? extends Operation> getOperations();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    boolean hasOperation(String name);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getOperation(String name);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setOperations(Map<String, ? extends Operation> operations);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setOperation(String name, Operation operation);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void removeOperation(String name);

    // Get
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getGet();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setGet(Operation get);

    // Put
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getPut();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setPut(Operation put);

    // Post
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getPost();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setPost(Operation post);

    // Delete
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getDelete();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setDelete(Operation delete);

    // Options
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getOptions();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setOptions(Operation options);

    // Head
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getHead();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setHead(Operation head);

    // Patch
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getPatch();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setPatch(Operation patch);

    // Trace
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Operation getTrace();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setTrace(Operation trace);

    // Server
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Collection<? extends Server> getServers();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Server getServer(int index);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setServers(Collection<? extends Server> servers);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setServer(int index, Server server);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void addServer(Server server);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void removeServer(int index);

    // Parameter
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Collection<? extends Parameter> getParameters();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Parameter getParameter(int index);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setParameters(Collection<? extends Parameter> parameters);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setParameter(int index, Parameter parameter);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void addParameter(Parameter parameter);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void removeParameter(int index);

    // Extension
    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Map<String, Object> getExtensions();

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    boolean hasExtension(String name);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    Object getExtension(String name);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setExtensions(Map<String, Object> extensions);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void setExtension(String name, Object extension);

    @Generated("com.reprezen.swaggerparser.jsonoverlay.gen.CodeGenerator")
    void removeExtension(String name);

}
