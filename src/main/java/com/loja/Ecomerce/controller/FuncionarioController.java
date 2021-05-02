package com.loja.Ecomerce.controller;

import com.loja.Ecomerce.dto.CreateFuncionarioDTO;
import com.loja.Ecomerce.dto.FuncionarioDTO;
import com.loja.Ecomerce.service.FuncionarioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("registra um novo funcionario no banco de dados")
    public FuncionarioDTO createFuncionario(@RequestBody CreateFuncionarioDTO createFuncionarioDTO){
        return service.createFuncionario(createFuncionarioDTO);
    }

    @GetMapping("/busca/{gameId}")
    @ApiOperation("encontra o funcionario a partir do seu id")
    @ResponseStatus(HttpStatus.FOUND)
    public FuncionarioDTO findFuncionarioById(@RequestParam Integer funcionarioId){
        return service.getFuncionarioById(funcionarioId);
    }
    @GetMapping
    @ApiOperation("encontra todos funcionarios da base")
    @ResponseStatus(HttpStatus.FOUND)
    public List<FuncionarioDTO> getFuncionariosList(@RequestParam(required = false) String name){
        return service.getFuncionarioList(name);
    }

    @DeleteMapping("/delete/{funcioonarioId}")
    @ApiOperation("deleta um funcionario registrado da base de dados")
    public ResponseEntity<?> deleteFuncionario(@RequestParam Integer id){
        service.deleteFuncionario(id);
        return ResponseEntity.ok(null);
    }
    public ResponseEntity<FuncionarioDTO> updateFuncionario(@RequestParam CreateFuncionarioDTO createFuncionarioDTO,
                                                      @RequestParam Integer funcionarioId){
        FuncionarioDTO funcionarioDTO = service.updateFuncionario(createFuncionarioDTO,funcionarioId);

        return ResponseEntity.ok(null);
    }


}
