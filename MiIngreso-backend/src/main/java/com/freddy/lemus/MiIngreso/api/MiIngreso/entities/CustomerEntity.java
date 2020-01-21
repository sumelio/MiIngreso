package com.freddy.lemus.MiIngreso.api.MiIngreso.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    private String document;
    private String name;
    private String lastName;
}
