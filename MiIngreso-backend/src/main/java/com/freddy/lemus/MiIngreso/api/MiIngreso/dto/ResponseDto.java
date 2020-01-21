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

package com.freddy.lemus.MiIngreso.api.MiIngreso.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.freddy.lemus.MiIngreso.api.MiIngreso.enums.ResponseCode;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto<T> {
    private long code;
    private String message;
    private ResponseCode responseCode;
    private T data;
}
