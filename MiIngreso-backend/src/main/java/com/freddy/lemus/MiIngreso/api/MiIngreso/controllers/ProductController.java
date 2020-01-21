package com.freddy.lemus.MiIngreso.api.MiIngreso.controllers;

import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.ApiRestConstants;
import static com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant.OK;

import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ProductDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ResponseDto;
import static com.freddy.lemus.MiIngreso.api.MiIngreso.enums.ResponseCode.SUCCESS;
import com.freddy.lemus.MiIngreso.api.MiIngreso.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = ApiRestConstants.API_REST_PRODUCT_END_POINT, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseDto<List<ProductDto>> getAllProducts() {
        return ResponseDto.
                <List<ProductDto>>builder()
                .data(this.productService.getAllProducts())
                .code(FOUND.value())
                .responseCode(SUCCESS)
                .message(OK)
                .build();
    }

    @PostMapping
    public ResponseDto<ProductDto> createProduct(@RequestBody @Valid  ProductDto productDto) {
        return ResponseDto.
                <ProductDto>builder()
                .data(this.productService.createProduct(productDto))
                .code(CREATED.value())
                .responseCode(SUCCESS)
                .message(OK)
                .build();
    }

    @PutMapping(ApiRestConstants.API_REST_UPDATE_PRODUCT_BY_ID)
    public ResponseDto<ProductDto> updateProductBYId(@PathVariable(value = "productId") Long productId) {
        return ResponseDto.
                <ProductDto>builder()
                .data(this.productService.updateProductById(productId))
                .code(HttpStatus.OK.value())
                .responseCode(SUCCESS)
                .message(MessageConstant.DELETE_SUCCESSFUL)
                .build();
    }

    @DeleteMapping(ApiRestConstants.API_REST_REMOVE_PRODUCT_BY_ID)
    public ResponseDto<ProductDto> deleteProductBYId(@PathVariable(value = "productId") Long productId) {
        this.productService.deleteProductById(productId);
        return ResponseDto.
                <ProductDto>builder()
                .code(HttpStatus.OK.value())
                .responseCode(SUCCESS)
                .message(MessageConstant.DELETE_SUCCESSFUL)
                .build();
    }

    @GetMapping(ApiRestConstants.API_REST_GET_PRODUCT_BY_ID)
    public ResponseDto<ProductDto> getProductBYId(@PathVariable(value = "productId") Long productId) {
        return ResponseDto.
                <ProductDto>builder()
                .data(this.productService.getProductById(productId))
                .code(FOUND.value())
                .responseCode(SUCCESS)
                .message(OK)
                .build();
    }
}
