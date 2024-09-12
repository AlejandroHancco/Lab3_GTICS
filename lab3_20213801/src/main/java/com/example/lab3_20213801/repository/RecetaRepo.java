package com.example.lab3_20213801.repository;

import com.example.lab3_20213801.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecetaRepo extends JpaRepository<Receta, Integer> {
}
