package com.example.lab3_20213801.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "unidad_medida")
public class UnidadMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idunidad_medida", nullable = false, length = 4)
    private Integer id;

    @Column (name = "nombre_unidad", nullable = false, length = 45)
    private String categoria;

    @Column (name = "simbolo", nullable = false, length = 10)
    private String simbolo;

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

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
