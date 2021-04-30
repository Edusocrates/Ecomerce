package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.dto.CreateFuncionarioDTO;
import com.loja.Ecomerce.dto.FuncionarioDTO;
import com.loja.Ecomerce.model.Funcionario;
import com.loja.Ecomerce.repository.FuncionarioRepository;
import com.loja.Ecomerce.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {


    @Autowired
    private FuncionarioRepository repository;

    @Override
    public FuncionarioDTO createFuncionario(CreateFuncionarioDTO createFuncionarioDTO) {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(createFuncionarioDTO.getCargo());
        funcionario.setCpf(createFuncionarioDTO.getCpf());
        funcionario.setDataNascimento(createFuncionarioDTO.getDataNascimento());
        funcionario.setMatricula(createFuncionarioDTO.getMatricula());
        funcionario.setNome(createFuncionarioDTO.getNome());
        funcionario.setSetor(createFuncionarioDTO.getSetor());
        Funcionario savedFuncionario = repository.save(funcionario);
        return new FuncionarioDTO(savedFuncionario);
    }

    @Override
    public FuncionarioDTO getFuncionarioById(Integer funcionarioId) {
        Funcionario funcionario = repository.findById(funcionarioId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new FuncionarioDTO(funcionario);
    }

    @Override
    public List<FuncionarioDTO> getFuncionarioList(String name) {
        return null;
    }
}
