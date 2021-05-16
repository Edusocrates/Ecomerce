package com.loja.Ecomerce.service.impl;

import com.loja.Ecomerce.repository.ClienteRepository;
import com.loja.Ecomerce.repository.FuncionarioRepository;
import com.loja.Ecomerce.repository.JogosRepository;
import com.loja.Ecomerce.repository.PlataformaRepository;
import com.loja.Ecomerce.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuServiceImpl implements MenuService {

    @Autowired
    private JogosRepository jogosRepository;

    @Autowired
    private PlataformaRepository plataformaRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private ClienteRepository clienteRepository;



}
