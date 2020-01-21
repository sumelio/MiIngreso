package com.freddy.lemus.MiIngreso.api.MiIngreso.entities;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "checkout_product")
public class CheckoutProductsEntity {
    @Id
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "id_checkout")
    private CheckOutEntity checkout;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private ProductEntity product;

    private double currentPrice;

}
