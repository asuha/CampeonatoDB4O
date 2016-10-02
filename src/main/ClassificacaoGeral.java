package main;

import java.io.Serializable;


public class ClassificacaoGeral implements Serializable {

	private static final long serialVersionUID = 1L;
    private long id;
    private int posicao;
    private Clube clube;
    private Campeonato campeonato;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

}
