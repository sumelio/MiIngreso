package com.freddy.lemus.MiIngreso.api.MiIngreso.controllers;

import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.ApiRestConstants;
import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ResponseDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.CheckOutDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import static com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant.OK;
import static com.freddy.lemus.MiIngreso.api.MiIngreso.enums.ResponseCode.SUCCESS;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping(value = ApiRestConstants.API_REST_SHOPPING_CAR_END_POINT, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
public class CheckoutController {

    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping
    public ResponseDto<String> checkout(@RequestBody CheckOutDto checkOutDto) {
        this.checkoutService.doCheckout(checkOutDto);
        return ResponseDto.<String>builder()
                .data(MessageConstant.CHECKOUT_OK)
                .code(FOUND.value())
                .responseCode(SUCCESS)
                .message(OK)
                .build();
    }
}
