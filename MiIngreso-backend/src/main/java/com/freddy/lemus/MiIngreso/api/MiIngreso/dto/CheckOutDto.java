package com.freddy.lemus.MiIngreso.api.MiIngreso.dto;

import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CustomerEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.ProductEntity;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckOutDto {
    private CustomerEntity customer;
    private List<ProductDto> products;
    private double totalPrice;
}
