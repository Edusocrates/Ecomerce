package com.loja.Ecomerce.repository;

import com.loja.Ecomerce.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogosRepository extends JpaRepository<Jogos,Integer> {

    @Query(nativeQuery = true, value = "SELECT c.* FROM Jogos c")
    List<Jogos> getAllJogos();
}
