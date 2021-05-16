package com.loja.Ecomerce.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private String nome;

    private List<Jogos> jogosList;

    private List<Plataforma> plataformaList;

    private Perfil perfil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogos> getJogosList() {
        return jogosList;
    }

    public void setJogosList(List<Jogos> jogosList) {
        this.jogosList = jogosList;
    }

    public List<Plataforma> getPlataformaList() {
        return plataformaList;
    }

    public void setPlataformaList(List<Plataforma> plataformaList) {
        this.plataformaList = plataformaList;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
