package com.loja.Ecomerce.repository;

import com.loja.Ecomerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {


    @Query(nativeQuery = true, value = "SELECT c FROM Cliente c WHERE c.Id =:clienteId")
    Cliente getFuncionarioById(@Param("clienteId") Integer clienteId);

    @Query(nativeQuery = true,value = "SELECT c FROM Cliente c")
    List<Cliente> getAllFuncionarios();
}
