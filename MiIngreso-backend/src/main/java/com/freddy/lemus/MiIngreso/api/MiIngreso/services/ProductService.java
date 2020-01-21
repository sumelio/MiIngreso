package com.freddy.lemus.MiIngreso.api.MiIngreso.services;

import com.freddy.lemus.MiIngreso.api.MiIngreso.constants.MessageConstant;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ProductDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.ProductEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.handle.customeException.ProductNotFound;
import com.freddy.lemus.MiIngreso.api.MiIngreso.mappings.ProductMapper;
import com.freddy.lemus.MiIngreso.api.MiIngreso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductMapper productMapper;

    @Autowired
    public ProductService(
            ProductRepository productRepository,
            ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDto> getAllProducts() {
        return this.productRepository.findAll()
                .stream().map(
                        this.productMapper::productEntityToProductDto)
                .collect(Collectors.toList());
    }

    public ProductDto createProduct(ProductDto productDto) {
        return this.productMapper
                .productEntityToProductDto(
                        this.productRepository.save(
                                this.productMapper.productDtoToProductEntity(productDto)
                        )
                );
    }

    public ProductDto getProductById(Long productId) {
        return this.productMapper.productEntityToProductDto(
                this.getProductByIdOrThrowNotFound(productId)
        );
    }

    public void deleteProductById(Long productId) {
        this.productRepository.delete(this.getProductByIdOrThrowNotFound(productId));
    }

    public ProductDto updateProductById(Long productId) {
        return  this.productMapper.productEntityToProductDto(
                        this.productRepository.save(this.getProductByIdOrThrowNotFound(productId))
                );
    }

    private ProductEntity getProductByIdOrThrowNotFound(Long productId) {
        return this.productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFound(String.format(MessageConstant.PRODUCT_NOT_FOUND, productId))
        );
    }
}
