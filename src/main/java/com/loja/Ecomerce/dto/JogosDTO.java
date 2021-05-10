package com.loja.Ecomerce.dto;

import com.loja.Ecomerce.model.Categoria;
import com.loja.Ecomerce.model.Console;
import com.loja.Ecomerce.model.Jogos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JogosDTO {

    private Integer id;
    private String nome;
    private Console console;
    private Date releaseDate;
    private Categoria categoria;
    private String descricao;

    public JogosDTO(Jogos jogos) {
        this.id = jogos.getId();
        this.nome = jogos.getNome();
        this.console = jogos.getConsole();
        this.releaseDate = jogos.getReleaseDate();
        this.categoria = jogos.getCategoria();
        this.descricao = jogos.getDescricao();
    }
}
