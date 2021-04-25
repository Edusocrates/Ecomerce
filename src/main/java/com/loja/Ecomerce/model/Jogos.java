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
public class Jogos {

    @Id
    private Integer id;
    @Column
    private String nome;
    @Column
    @Enumerated
    private Console console;
    @Column
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Column
    @Enumerated
    private Categoria categoria;
    @Column
    private String descricao;
}
