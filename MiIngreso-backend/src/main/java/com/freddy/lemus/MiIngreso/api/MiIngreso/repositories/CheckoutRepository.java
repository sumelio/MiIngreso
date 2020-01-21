package com.freddy.lemus.MiIngreso.api.MiIngreso.repositories;

import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.CheckOutEntity;
import com.freddy.lemus.MiIngreso.api.MiIngreso.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckOutEntity, Long> {
}
