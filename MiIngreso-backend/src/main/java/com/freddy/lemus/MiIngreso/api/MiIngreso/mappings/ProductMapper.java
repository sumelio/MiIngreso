package com.freddy.lemus.MiIngreso.api.MiIngreso.mappings;

import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ProductDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(target="title", source="name"),
            @Mapping(target="img", source="image")
    })
    ProductDto productEntityToProductDto(ProductEntity productEntity);

    @Mappings({
            @Mapping(target="name", source="title"),
            @Mapping(target="image", source="img")
    })
    ProductEntity productDtoToProductEntity(ProductDto productDto);
}
