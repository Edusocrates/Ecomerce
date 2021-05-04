package com.loja.Ecomerce.controller;


import com.loja.Ecomerce.model.HealthHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class HealthController {


    @GetMapping
    public HealthHelper healthCheck(){
        return new HealthHelper("UP");
    }

}
