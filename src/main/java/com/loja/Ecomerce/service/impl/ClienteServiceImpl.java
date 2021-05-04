package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.dto.ClienteDTO;
import com.loja.Ecomerce.dto.CreateClienteDTO;
import com.loja.Ecomerce.model.Cliente;
import com.loja.Ecomerce.repository.ClienteRepository;
import com.loja.Ecomerce.service.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Autowired
    private ClienteRepository repository;

    @Override
    public ClienteDTO createCliente(CreateClienteDTO createClienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(createClienteDTO.getNome());
        cliente.setCpf(createClienteDTO.getCpf());
        cliente.setDataNascimento(createClienteDTO.getDataNascimento());
        Cliente savedCliente = repository.save(cliente);
        return new ClienteDTO(savedCliente);
    }

    @Override
    public ClienteDTO getFuncionarioById(Integer clienteId) {
       // Cliente cliente = findFuncionarioById(clienteId);
        Cliente cliente = repository.getFuncionarioById(clienteId);
        return new ClienteDTO(cliente);
    }

    @Override
    public List<ClienteDTO> getClienteList() {
        List<Cliente> clienteList = repository.getAllFuncionarios();
        return clienteList.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

    @Override
    public void deleteCliente(Integer clienteId) {
        repository.deleteById(clienteId);
    }

    @Override
    public ClienteDTO updateCliente(Integer clienteId, CreateClienteDTO createClienteDTO) {
        Cliente cliente = repository.getFuncionarioById(clienteId);
        if(cliente == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente não encontrado !! Id: "+clienteId);
        }
        BeanUtils.copyProperties(createClienteDTO,cliente);
        Cliente updatedCliente = repository.save(cliente);
        return new ClienteDTO(updatedCliente);
    }

    public Cliente findFuncionarioById(Integer clienteId) {
        return repository.findById(clienteId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente Não encontrado !"));
    }
}
