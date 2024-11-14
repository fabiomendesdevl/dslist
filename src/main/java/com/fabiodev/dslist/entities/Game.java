package com.fabiodev.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity   //equivalente a uma tabela do banco relacional
@Table(name = "tb_game") // nome da tabela do banco
public class Game {

    //ORM: MAPEAMENTO OBJETO RELACIONAL
    // auto increment, a frente e uma forma de como o banco vai gerar o id
    //caso queira customizar coluna no banco usasse @Column (name = "nomedacoluna" que a gente vai customizar sempre abaixo)
    //chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double pontuacao;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String pequenaDescricao;

    @Column(columnDefinition = "TEXT")
    private String longaDescricao;

    public Game() {
    }


    //opcional


    public Game(Long id, Integer ano, String genero, String plataforma, Double pontuacao, String imgUrl, String pequenaDescricao, String longaDescricacao) {
        this.id = id;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
        this.pontuacao = pontuacao;
        this.imgUrl = imgUrl;
        this.pequenaDescricao = pequenaDescricao;
        this.longaDescricao = longaDescricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getLongaDescricao() {
        return longaDescricao;
    }

    public void setLongaDescricao(String longaDescricao) {
        this.longaDescricao = longaDescricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
