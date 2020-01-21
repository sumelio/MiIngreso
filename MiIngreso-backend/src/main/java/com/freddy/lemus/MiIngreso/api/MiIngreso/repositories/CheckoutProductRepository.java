package com.freddy.lemus.MiIngreso.api.MiIngreso.repositories;

import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CheckoutProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProductsEntity, Long> {
}
