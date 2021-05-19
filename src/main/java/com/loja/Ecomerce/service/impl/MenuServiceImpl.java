package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.dto.MenuDTO;
import com.loja.Ecomerce.model.Jogos;
import com.loja.Ecomerce.model.Menu;
import com.loja.Ecomerce.model.Plataforma;
import com.loja.Ecomerce.repository.ClienteRepository;
import com.loja.Ecomerce.repository.FuncionarioRepository;
import com.loja.Ecomerce.repository.JogosRepository;
import com.loja.Ecomerce.repository.PlataformaRepository;
import com.loja.Ecomerce.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService {

    @Autowired
    private JogosRepository jogosRepository;

    @Autowired
    private PlataformaRepository plataformaRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public MenuDTO getMenuItem(String pesquisa) {
        Menu menu = new Menu();
        if(pesquisa != null){
            List<Jogos> jogosList = new ArrayList<>();
            List<Plataforma> plataformaList = new ArrayList<>();
            jogosList = jogosRepository.finddJogoByName(pesquisa);
            menu.setJogosList(jogosList);
        if (jogosList.isEmpty() || jogosList == null){
            plataformaList = plataformaRepository.findPlataformaByName(pesquisa);
            menu.setPlataformaList(plataformaList);
        }


        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"parametro vazio !");
        }
        return new MenuDTO(menu);
    }
}
