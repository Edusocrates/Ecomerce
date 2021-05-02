package com.loja.Ecomerce.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Venda")
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome_produto;

    @Column
    private String descricao;

    @Column
    private Double valor;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataVenda;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Venda(Integer id, String nome_produto, String descricao, Double valor, Date dataVenda) {
        this.id = id;
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVenda = dataVenda;
    }

    public Venda() {
    }
}
