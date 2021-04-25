package com.loja.Ecomerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    @Id
    private Integer id;
    @Column
    private String matricula;
    @Column
    private String nome;
    @Column
    private String cargo;
    @Column
    @Enumerated
    private Setor setor;
    @Column
    @Temporal(TemporalType.DATE)
    private Date DataNascimento;


}
