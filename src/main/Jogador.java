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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }


}

