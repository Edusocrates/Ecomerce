package com.loja.Ecomerce.service;

import com.loja.Ecomerce.dto.ClienteDTO;
import com.loja.Ecomerce.dto.CreateClienteDTO;

import java.util.List;

public interface ClienteService {


    ClienteDTO createCliente(CreateClienteDTO createClienteDTO);

    ClienteDTO getFuncionarioById(Integer clienteId);

    List<ClienteDTO> getClienteList();

    void deleteCliente(Integer clienteId);

    ClienteDTO updateCliente(Integer clienteId, CreateClienteDTO createClienteDTO);
}
