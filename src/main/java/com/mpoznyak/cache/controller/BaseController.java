package com.mpoznyak.cache.controller;

import com.mpoznyak.cache.dto.ExceptionInfoDto;
import com.mpoznyak.cache.exception.RequestValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mpoznyak on 08.04.2019
 */

public class BaseController {
    /**
     * Logger.
     */

    /**
     * Handler of all not caught RequestValidationException received from services.
     * @param rve any exception.
     * @param req  HttpServletRequest
     * @return String with exception message to frontend.
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ExceptionInfoDto handleException(HttpServletRequest req, RequestValidationException rve) {
        return new ExceptionInfoDto(rve.getMessage(), rve);
    }

    /**
     * Handler of all not caught not specified exceptions (for example not RequestValidationException).
     * @param e any exception.
     * @param req  HttpServletRequest
     * @return String with exception message to frontend.
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionInfoDto handleException(HttpServletRequest req, Exception e) {
        return new ExceptionInfoDto(e.getMessage(), e);
    }


}
