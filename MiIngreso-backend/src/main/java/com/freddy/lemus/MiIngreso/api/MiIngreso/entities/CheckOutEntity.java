package com.freddy.lemus.MiIngreso.api.MiIngreso.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * Checkout entity.
 *
 * @since 1.0.0
 * @version 1.0.0
 * @author <a href="sumel124@gmail.com">Freddy Lemus</a>
 *
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "checkout")
public class CheckOutEntity {
    @Id
    private Long id;

    private LocalDateTime checkoutDate;

    @ManyToOne
    @JoinColumn(name = "document_customer")
    private CustomerEntity customer;

    private double totalPrice;
}
