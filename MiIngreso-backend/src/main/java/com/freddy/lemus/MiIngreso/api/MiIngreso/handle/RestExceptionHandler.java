/*
 *
 *  *   Copyright 2020, Nexos Software S.A.S
 *  *   https://nxs.com.co/
 *  *
 *  *   All rights reserved
 *  *   Date: 12/02/2020
 *
 *
 */

package com.freddy.lemus.MiIngreso.api.MiIngreso.handle;

import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ResponseDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.enums.ResponseCode;
import com.freddy.lemus.MiIngreso.api.MiIngreso.handle.customeException.ProductNotFound;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> handleException(Exception ex) {

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String errorDetail = MessageConstant.GENERAL_ERROR_MESSAGE;
        log.error(ex.getLocalizedMessage(), ex);

        return ResponseEntity
                .status(status)
                .body(ResponseDto.<String>builder()
                        .message(errorDetail)
                        .code(status.value())
                        .responseCode(ResponseCode.ERROR)
                        .build());
    }

    @ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<ResponseDto> handleProductNotFound(ProductNotFound ex) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        log.error(ex.getLocalizedMessage(), ex);

        return ResponseEntity
                .status(status)
                .body(ResponseDto.<String>builder()
                        .message(ex.getMessage())
                        .code(status.value())
                        .responseCode(ResponseCode.FAIL)
                        .build());
    }
}
