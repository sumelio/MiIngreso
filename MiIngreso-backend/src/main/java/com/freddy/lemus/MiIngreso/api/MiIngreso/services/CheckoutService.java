package com.freddy.lemus.MiIngreso.api.MiIngreso.services;

import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.CheckOutDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.dto.ProductDto;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CheckOutEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CheckoutProductsEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.mappings.CheckoutMapper;
import com.freddy.lemus.MiIngreso.api.MiIngreso.mappings.ProductMapper;
import com.freddy.lemus.MiIngreso.api.MiIngreso.repositories.CheckoutProductRepository;
import com.freddy.lemus.MiIngreso.api.MiIngreso.repositories.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    private CheckoutRepository checkoutRepository;
    private CheckoutProductRepository checkoutProductRepository;
    private CheckoutMapper checkoutMapper;
    private ProductMapper productMapper;

    @Autowired
    public CheckoutService(CheckoutRepository checkoutRepository,
                           CheckoutProductRepository checkoutProductRepository,
                           CheckoutMapper checkoutMapper,
                           ProductMapper productMapper) {
        this.checkoutRepository = checkoutRepository;
        this.checkoutMapper = checkoutMapper;
        this.productMapper = productMapper;
        this.checkoutProductRepository = checkoutProductRepository;
    }

    /**
     * Register a checkout
     * 1. Calculate the total price of all productos
     * 2. Save the checkout
     * 3. Save the checkout-product with current price for each product
     * @param checkOutDto
     */
    public void doCheckout(CheckOutDto checkOutDto) {

        // Calculate total price of checkout
        checkOutDto.setTotalPrice( this.calculateTotalPrice(checkOutDto) );

        // Save checkout
        CheckOutEntity checkOutEntity = this.checkoutRepository.save(
                this.checkoutMapper.checkoutDtoToCheckoutEntity(checkOutDto)
        );

        // Save checkout and product
        checkOutDto.getProducts()
                .stream().forEach( productDto ->
                {
                    CheckoutProductsEntity checkoutProductsEntity =
                            this.createCheckoutProductEntity(checkOutEntity, productDto);
                    this.checkoutProductRepository.save(checkoutProductsEntity);
                }
                );
    }

    private CheckoutProductsEntity createCheckoutProductEntity(
            CheckOutEntity checkOutEntity,
            ProductDto productDto) {
        return CheckoutProductsEntity.builder()
                .checkout(checkOutEntity)
                .product(this.productMapper.productDtoToProductEntity(productDto))
                .currentPrice(productDto.getPrice())
                .build();
    }

    /**
     * FOr each product get the price and add to accumulate or totalPrice.
     *
     * @param checkOutDto
     * @return total price
     */
    private double calculateTotalPrice(CheckOutDto checkOutDto) {
        return checkOutDto.getProducts()
                .stream()
                .map(ProductDto::getPrice)
                .reduce( (accumulate, currentPrice ) -> accumulate + currentPrice ).orElseGet(() -> 0.0);
    }
}
