package com.loja.Ecomerce.repository;

import com.loja.Ecomerce.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogosRepository extends JpaRepository<Jogos,Integer> {

}
