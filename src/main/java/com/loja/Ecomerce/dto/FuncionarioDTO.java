package com.loja.Ecomerce.dto;

import com.loja.Ecomerce.model.Setor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {

    private Integer id;
    private String matricula;
    private String nome;
    private String cargo;
    private Setor setor;
    private Date DataNascimento;
    private String cpf;
}
