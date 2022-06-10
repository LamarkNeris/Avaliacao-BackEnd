package com.dh.Catalog;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Catalog")
@Data
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
