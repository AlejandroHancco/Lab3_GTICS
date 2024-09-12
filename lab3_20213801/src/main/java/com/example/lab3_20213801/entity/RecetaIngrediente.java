package com.example.lab3_20213801.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "receta_ingrediente")
public class RecetaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_receta_ingrediente", nullable = false, length = 4)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "idreceta")
    private Receta receta;

    @ManyToOne
    @JoinColumn(name = "idingrediente")
    private Ingrediente ingrediente;

    @Column (name = "idunidad_medida")
    private String instrucciones;

    @Column (name = "cantidad")
    private Double cantidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
