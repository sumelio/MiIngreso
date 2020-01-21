package com.freddy.lemus.MiIngreso.api.MiIngreso.dto;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product dto.
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
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private String img;
    private double price;
}
