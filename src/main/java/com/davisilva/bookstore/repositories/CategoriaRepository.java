package com.davisilva.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davisilva.bookstore.domain.Categoria;

@Repository /*Informar para o Spring que estamos criando uma interface repository*/
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
