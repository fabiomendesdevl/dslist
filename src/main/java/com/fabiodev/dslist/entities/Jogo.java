package com.fabiodev.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity   //equivalente a uma tabela do banco relacional
@Table(name = "tb_jogo") // nome da tabela do banco

public class Jogo {

    //ORM: MAPEAMENTO OBJETO RELACIONAL

    @Id  //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // auto increment, a frente e uma forma de como o banco vai gerar o id
    private long id;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double pontuacao;
    //caso queira customizar coluna no banco usasse @Column (name = "nomedacoluna" que a gente vai customizar sempre abaixo)
    private String imgUrl;
    private String pequenaDescricao;
    private String longaDescricacao;

    public Jogo() {
    }


    //opcional

    public Jogo(long id, Integer ano, String genero, String plataforma, Double pontuacao, String imgUrl, String pequenaDescricao, String longaDescricacao) {
        this.id = id;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.pontuacao = pontuacao;
        this.imgUrl = imgUrl;
        this.pequenaDescricao = pequenaDescricao;
        this.longaDescricacao = longaDescricacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPequenaDescricao() {
        return pequenaDescricao;
    }

    public void setPequenaDescricao(String pequenaDescricao) {
        this.pequenaDescricao = pequenaDescricao;
    }

    public String getLongaDescricacao() {
        return longaDescricacao;
    }

    public void setLongaDescricacao(String longaDescricacao) {
        this.longaDescricacao = longaDescricacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return id == jogo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
