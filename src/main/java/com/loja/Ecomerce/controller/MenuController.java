package com.loja.Ecomerce.controller;

import com.loja.Ecomerce.dto.MenuDTO;
import com.loja.Ecomerce.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/pesquisa/{pesquisa}")
    public MenuDTO getMenuItem(@RequestParam String pesquisa){
        return menuService.getMenuItem(pesquisa);
    }
}
