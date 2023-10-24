package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column (name = "description")
    private String description;

    private Boolean status=true;

    @OneToOne
    @JoinColumn(name = "unit_Id", referencedColumnName = "id")
    private Unit unit;


}
