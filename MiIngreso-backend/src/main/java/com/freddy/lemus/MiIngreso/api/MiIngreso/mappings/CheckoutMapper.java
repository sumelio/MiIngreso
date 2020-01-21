package com.freddy.lemus.MiIngreso.api.MiIngreso.mappings;

import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.CheckOutDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ProductDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CheckOutEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CheckoutMapper {
    CheckOutDto checkoutEntityToCheckoutDto(CheckOutEntity checkOutEntity);
    CheckOutEntity checkoutDtoToCheckoutEntity(CheckOutDto checkOutDto);
}
