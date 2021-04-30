package com.loja.Ecomerce.dto;

import com.loja.Ecomerce.model.Categoria;
import com.loja.Ecomerce.model.Console;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateJogosDTO {

    private Integer id;
    private String nome;
    private Console console;
    private Date releaseDate;
    private Categoria categoria;
    private String descricao;
}
