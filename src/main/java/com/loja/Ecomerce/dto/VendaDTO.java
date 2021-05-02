package com.loja.Ecomerce.dto;

import com.loja.Ecomerce.model.Venda;

import java.util.Date;
import java.util.Objects;

public class VendaDTO {


        private Integer id;
        private String nome_produto;
        private String descricao;
        private Double valor;
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

    public VendaDTO(Integer id, String nome_produto, String descricao, Double valor, Date dataVenda) {
        this.id = id;
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVenda = dataVenda;
    }
    public VendaDTO(Venda venda) {
        this.id = venda.getId();
        this.nome_produto = venda.getNome_produto();
        this.descricao = venda.getDescricao();
        this.valor = venda.getValor();
        this.dataVenda = venda.getDataVenda();
    }

    public VendaDTO() {
    }

}
