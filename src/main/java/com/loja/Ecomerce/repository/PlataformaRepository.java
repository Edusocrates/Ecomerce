package com.loja.Ecomerce.repository;

import com.loja.Ecomerce.model.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma,Integer> {

    @Query(nativeQuery = true, value = "SELECT c.* FROM Plataforma c WHERE c.nome LIKE %:nome%")
    List<Plataforma> findPlataformaByName(@Param("nome") String nome);
}
