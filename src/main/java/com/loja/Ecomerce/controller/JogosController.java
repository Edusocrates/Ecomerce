package com.loja.Ecomerce.controller;

import com.loja.Ecomerce.dto.CreateJogosDTO;
import com.loja.Ecomerce.dto.JogosDTO;
import com.loja.Ecomerce.service.JogosService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogos")
public class JogosController {

    @Autowired
    private JogosService service;


    @PostMapping
    @ApiOperation("cria um novo jogo na base de dados")
    @ResponseStatus(HttpStatus.CREATED)
    public JogosDTO createJogo(@RequestBody CreateJogosDTO createJogosDTO){
        return service.createJogo(createJogosDTO);
    }

    @GetMapping
    @ApiOperation("encontra um jogo na base por Id")
    public  JogosDTO getJogoById(@RequestHeader Integer jogoId){
        return service.getJogoById(jogoId);
    }
    @GetMapping
    @ApiOperation("busca todos os jogos")
    public List<JogosDTO> getJogosList(@RequestHeader(required = false) Integer jogoId){
        return service.getJogosList(jogoId);
    }
    @DeleteMapping
    @ApiOperation("deleta um jogo através do seu Id")
    public ResponseEntity<?> deleteJogo(@RequestHeader Integer jogoId){
        service.deleteJogo(jogoId);
        return ResponseEntity.ok(null);
    }
    @PutMapping
    @ApiOperation("atualiza um jogoo")
    public ResponseEntity<JogosDTO> updateJogo(@RequestBody CreateJogosDTO createJogosDTO,
                                       @RequestHeader Integer jogoId){

        JogosDTO jogosDTO = service.updateJogo(createJogosDTO,jogoId);

        return ResponseEntity.ok(jogosDTO);
    }


}
