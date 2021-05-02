package com.loja.Ecomerce.service;

import com.loja.Ecomerce.dto.CreateFuncionarioDTO;
import com.loja.Ecomerce.dto.FuncionarioDTO;

import java.util.List;

public interface FuncionarioService {


    FuncionarioDTO createFuncionario(CreateFuncionarioDTO createFuncionarioDTO);

    FuncionarioDTO getFuncionarioById(Integer funcionarioId);

    List<FuncionarioDTO> getFuncionarioList(String name);

    void deleteFuncionario(Integer id);

    FuncionarioDTO updateFuncionario(CreateFuncionarioDTO createFuncionarioDTO, Integer funcionarioId);
}
