package com.loja.Ecomerce.service;

import com.loja.Ecomerce.dto.CreateJogosDTO;
import com.loja.Ecomerce.dto.JogosDTO;

import java.util.List;

public interface JogosService {


    JogosDTO createJogo(CreateJogosDTO createJogosDTO);

    JogosDTO getJogoById(Integer jogoId);

    List<JogosDTO> getJogosList(Integer jogoId);

    void deleteJogo(Integer jogoId);

    JogosDTO updateJogo(CreateJogosDTO createJogosDTO, Integer jogoId);
}
