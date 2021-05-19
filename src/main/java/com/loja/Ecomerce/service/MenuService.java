package com.loja.Ecomerce.service;

import com.loja.Ecomerce.dto.MenuDTO;

public interface MenuService {

    MenuDTO getMenuItem(String pesquisa);
}
