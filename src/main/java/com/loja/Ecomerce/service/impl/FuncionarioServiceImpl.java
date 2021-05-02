package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.dto.CreateFuncionarioDTO;
import com.loja.Ecomerce.dto.FuncionarioDTO;
import com.loja.Ecomerce.model.Funcionario;
import com.loja.Ecomerce.repository.FuncionarioRepository;
import com.loja.Ecomerce.service.FuncionarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

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
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Não foi encontrado o funcionario"));
        return new FuncionarioDTO(funcionario);
    }

    @Override
    public List<FuncionarioDTO> getFuncionarioList(String name) {
        List<Funcionario> funcionarioList = repository.findAll();
        //verificar a necessidade de criar um SimpleFuncionarioDTO
        return funcionarioList.stream()
                .filter(funcionario -> name == null ||funcionario.getNome().startsWith(name))
                .map(FuncionarioDTO::new).collect(Collectors.toList());
    }

    @Override
    public void deleteFuncionario(Integer id) {
        //encontra primeiro e depois deleta
//        Funcionario funcionario = repository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Não foi encontrado o funcionario para deletar"));
//        repository.delete(funcionario);
        //deleta direto pelo id tb
        repository.deleteById(id);
    }

    @Override
    public FuncionarioDTO updateFuncionario(CreateFuncionarioDTO createFuncionarioDTO, Integer funcionarioId) {
        Funcionario funcionario = repository.findById(funcionarioId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Não foi encontrado o funcionario"));
        BeanUtils.copyProperties(createFuncionarioDTO,funcionario);
        Funcionario updatedFuncionario = repository.save(funcionario);
        return new FuncionarioDTO(updatedFuncionario);
    }
}
