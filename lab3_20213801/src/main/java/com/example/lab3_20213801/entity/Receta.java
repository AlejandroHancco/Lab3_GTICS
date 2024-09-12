package com.example.lab3_20213801.entity;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table (name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idreceta", nullable = false, length = 4)
    private Integer id;

    @Column (name = "nombre", nullable = false, length = 200)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private Categoria categoria;

    @Column (name = "instrucciones")
    private String instrucciones;

    @Column (name = "dificultad", nullable = false)
    private Integer dificultad;

    @Column (name = "tiempo_preparacion")
    private String tiempoPreparacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public String getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(String tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
}
