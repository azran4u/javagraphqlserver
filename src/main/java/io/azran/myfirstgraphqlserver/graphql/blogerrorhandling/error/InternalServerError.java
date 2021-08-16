package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.error;

import java.util.List;
import java.util.Map;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class InternalServerError extends RuntimeException implements GraphQLError {

    public InternalServerError() {
        super("internal server error");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.ExecutionAborted;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return null;
    }

    @Override
    public List<Object> getPath() {
        return null;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

}
