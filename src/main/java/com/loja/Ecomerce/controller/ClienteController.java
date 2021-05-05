package com.loja.Ecomerce.controller;

import com.loja.Ecomerce.dto.ClienteDTO;
import com.loja.Ecomerce.dto.CreateClienteDTO;
import com.loja.Ecomerce.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/v1/novo")
    @ApiOperation("Cadastra um novo cliente na base de dados")
    public ClienteDTO createClienteDTO(@RequestBody CreateClienteDTO createClienteDTO){
        return service.createCliente(createClienteDTO);
    }

    @GetMapping("/v1/{clienteId}")
    @ApiOperation("encontra um cliente pelo seu Id")
    public ClienteDTO getFuncionarioById(@RequestParam Integer clienteId){
        return service.getFuncionarioById(clienteId);
    }

    @GetMapping
    @ApiOperation("busca todos os clientes cadastrados na base")
    public List<ClienteDTO> getClienteList(){
        return service.getClienteList();
    }
    @DeleteMapping
    @ApiOperation("deleta um cliente cadastrado na base através do seu Id")
    public ResponseEntity<?> deleteCliente(@RequestParam Integer clienteId){
        service.deleteCliente(clienteId);
        return ResponseEntity.ok(null);
    }
    public ResponseEntity<ClienteDTO> updateCliente(@RequestParam Integer clienteId,
                                                    @RequestBody CreateClienteDTO createClienteDTO){
        ClienteDTO clienteDTO = service.updateCliente(clienteId,createClienteDTO);
        return ResponseEntity.ok(clienteDTO);
    }

}
