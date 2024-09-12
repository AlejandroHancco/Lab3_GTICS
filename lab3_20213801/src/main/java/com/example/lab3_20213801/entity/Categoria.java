package com.example.lab3_20213801.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria", nullable = false, length = 4)
    private Integer id;

    @Column (name = "categoria", nullable = false, length = 45)
    private String categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
