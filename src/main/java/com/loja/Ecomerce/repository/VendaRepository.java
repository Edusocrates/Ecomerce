package com.loja.Ecomerce.repository;

import com.loja.Ecomerce.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Integer> {
}
