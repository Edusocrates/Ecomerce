package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.dto.CreateJogosDTO;
import com.loja.Ecomerce.dto.JogosDTO;
import com.loja.Ecomerce.model.Jogos;
import com.loja.Ecomerce.repository.JogosRepository;
import com.loja.Ecomerce.service.JogosService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogosServiceImpl implements JogosService {


    @Autowired
    private JogosRepository repository;

    @Override
    public JogosDTO createJogo(CreateJogosDTO createJogosDTO) {
        Jogos jogos = new Jogos();
        jogos.setCategoria(createJogosDTO.getCategoria());
        jogos.setConsole(createJogosDTO.getConsole());
        jogos.setDescricao(createJogosDTO.getDescricao());
        jogos.setNome(createJogosDTO.getNome());
        jogos.setReleaseDate(createJogosDTO.getReleaseDate());
        Jogos savedJogo = repository.save(jogos);
        return new JogosDTO(savedJogo);
    }

    @Override
    public JogosDTO getJogoById(Integer jogoId) {
        Jogos jogo = findJogoById(jogoId);
        return new JogosDTO(jogo);
    }

    @Override
    public List<JogosDTO> getJogosList(Integer jogoId) {
        List<Jogos> jogosList = new ArrayList<>();
        if (jogoId == null){
           jogosList = repository.getAllJogos();
        }else{
            jogosList = Arrays.asList(findJogoById(jogoId));
        }

        return jogosList.stream().map(JogosDTO::new).collect(Collectors.toList());
    }

    @Override
    public void deleteJogo(Integer jogoId) {
        //preparar tratativas da erro depois
        repository.deleteById(jogoId);
    }

    @Override
    public JogosDTO updateJogo(CreateJogosDTO createJogosDTO, Integer jogoId) {
        Jogos jogos = findJogoById(jogoId);
        BeanUtils.copyProperties(createJogosDTO,jogos);
        Jogos updatedJogo = repository.save(jogos);
        return new JogosDTO(updatedJogo);
    }

    public Jogos findJogoById(Integer jogoId) {
        return repository.findById(jogoId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum Jogo encontrado !"));
    }

}
