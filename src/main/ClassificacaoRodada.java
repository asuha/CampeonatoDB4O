package main;

import java.io.Serializable;

public class ClassificacaoRodada implements Serializable {

	private static final long serialVersionUID = 1L;
	private int posicao;
	private Clube clube;
	private Campeonato campeonato;
    private Rodada rodada;

    public ClassificacaoRodada(int posicao, Clube clube, Campeonato campeonato, Rodada rodada){
        this.posicao = posicao;
        this.clube = clube;
        this.campeonato = campeonato;
        this.rodada = rodada;
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

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }
}
