package main;

import java.io.Serializable;

public class Jogador implements Serializable {

    public static final long serialVersionUID = 1L;

    private String nome;
    private Posicao posicao;
    private Clube clube;

    public Jogador(String nome, Posicao posicao, Clube clube){
        this.nome = nome;
        this.posicao = posicao;
        this.clube = clube;
    }

    public String getNome() {
        return this.nome;
    }

    public Posicao getPosicao(){
        return this.posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

}

