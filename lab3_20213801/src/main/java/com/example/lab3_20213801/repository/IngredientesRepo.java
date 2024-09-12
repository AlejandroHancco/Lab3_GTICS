package com.example.lab3_20213801.repository;

import com.example.lab3_20213801.entity.Categoria;
import com.example.lab3_20213801.entity.Categoria;
import com.example.lab3_20213801.entity.RecetaIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IngredientesRepo extends JpaRepository<RecetaIngrediente, Integer> {

    @Query(value="select * from receta_ingrediente where idreceta=?1",nativeQuery = true)
    List<RecetaIngrediente> findbyIdReceta(Integer idreceta);
}
