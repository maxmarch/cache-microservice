package com.mpoznyak.cache.dto;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by mpoznyak on 08.04.2019
 */

public class ExceptionInfoDto {

    private final String message;

    private final String exception;

    public ExceptionInfoDto(String message, Exception ex) {
        this.message = message;
        this.exception = exceptionToString(ex);
    }

    private String exceptionToString(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    public String getMessage() {
        return message;
    }

    public String getException() {
        return exception;
    }
}