package com.heliohdd.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heliohdd.cursomc.resource.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}