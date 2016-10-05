package main;

import java.io.Serializable;

public class ClassificacaoRodada implements Serializable {

	private static final long serialVersionUID = 1L;
	private int posicao;
	private Clube clube;
	private Campeonato campeonato;

    public ClassificacaoRodada(int posicao, Clube clube, Campeonato campeonato){
        this.posicao = posicao;
        this.clube = clube;
        this.campeonato = campeonato;
    }

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
