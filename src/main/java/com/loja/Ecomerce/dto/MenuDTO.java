package com.loja.Ecomerce.dto;

import com.loja.Ecomerce.model.Jogos;
import com.loja.Ecomerce.model.Menu;
import com.loja.Ecomerce.model.Perfil;
import com.loja.Ecomerce.model.Plataforma;

import java.util.List;

public class MenuDTO {
    private String nome;

    private List<Jogos> jogosList;

    private List<Plataforma> plataformaList;

    private Perfil perfil;

    public MenuDTO(Menu menu) {
        this.nome = menu.getNome();
        this.jogosList = menu.getJogosList();
        this.plataformaList = menu.getPlataformaList();
        this.perfil = menu.getPerfil();
    }

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
