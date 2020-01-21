package com.freddy.lemus.MiIngreso.api.MiIngreso.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product entity.
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
@Table(name = "product")
public class ProductEntity {
    @Id
    private Long id;
    private String name;
    private String description;
    private String image;
    private double price;
}
