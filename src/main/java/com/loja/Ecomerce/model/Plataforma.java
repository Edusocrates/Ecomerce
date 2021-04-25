package com.loja.Ecomerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plataforma {

    @Id
    private Integer id;
    @Column
    private String nome;
    @Column
    private String descicao;
    @Column
    private Integer memoria;

}
