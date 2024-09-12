package com.example.lab3_20213801.repository;

import com.example.lab3_20213801.entity.Categoria;
import com.example.lab3_20213801.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {
}
