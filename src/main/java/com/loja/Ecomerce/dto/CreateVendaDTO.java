package com.loja.Ecomerce.dto;

import java.util.Date;

public class CreateVendaDTO {


    private String nome_produto;
    private String descricao;
    private Double valor;
    private Date dataVenda;

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

    public CreateVendaDTO(String nome_produto, String descricao, Double valor, Date dataVenda) {
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVenda = dataVenda;
    }

    public CreateVendaDTO() {
    }
}
