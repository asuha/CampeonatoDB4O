package main;

import java.io.Serializable;

public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;
    private Campeonato campeonato;
    private Rodada rodada;
    private Clube clube1;
    private Clube clube2;
    private int clube1Gol;
    private int clube2Gol;
    private int clube1Ponto;
    private int clube2Ponto;
    private int clube1Amarelo;
    private int clube2Amarelo;
    private int clube1Vermelho;
    private int clube2Vermelho;

    public Jogo(Campeonato campeonato, Rodada rodada, Clube clube1, Clube clube2,
                int clube1Gol, int clube2Gol, int clube1Ponto, int clube2Ponto,
                int clube1Amarelo, int clube2Amarelo, int clube1Vermelho, int clube2Vermelho) {
        this.campeonato = campeonato;
        this.rodada = rodada;
        this.clube1 = clube1;
        this.clube2 = clube2;
        this.clube1Gol = clube1Gol;
        this.clube2Gol = clube2Gol;
        this.clube1Ponto = clube1Ponto;
        this.clube2Ponto = clube2Ponto;
        this.clube1Amarelo = clube1Amarelo;
        this.clube2Amarelo = clube2Amarelo;
        this.clube1Vermelho = clube1Vermelho;
        this.clube2Vermelho = clube2Vermelho;
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

    public Clube getClube1() {
        return clube1;
    }

    public void setClube1(Clube clube1) {
        this.clube1 = clube1;
    }

    public Clube getClube2() {
        return clube2;
    }

    public void setClube2(Clube clube2) {
        this.clube2 = clube2;
    }

    public int getClube1Gol() {
        return clube1Gol;
    }

    public void setClube1Gol(int clube1Gol) {
        this.clube1Gol = clube1Gol;
    }

    public int getClube2Gol() {
        return clube2Gol;
    }

    public void setClube2Gol(int clube2Gol) {
        this.clube2Gol = clube2Gol;
    }

    public int getClube1Ponto() {
        return clube1Ponto;
    }

    public void setClube1Ponto(int clube1Ponto) {
        this.clube1Ponto = clube1Ponto;
    }

    public int getClube2Ponto() {
        return clube2Ponto;
    }

    public void setClube2Ponto(int clube2Ponto) {
        this.clube2Ponto = clube2Ponto;
    }

    public int getClube1Amarelo() {
        return clube1Amarelo;
    }

    public void setClube1Amarelo(int clube1Amarelo) {
        this.clube1Amarelo = clube1Amarelo;
    }

    public int getClube2Amarelo() {
        return clube2Amarelo;
    }

    public void setClube2Amarelo(int clube2Amarelo) {
        this.clube2Amarelo = clube2Amarelo;
    }

    public int getClube1Vermelho() {
        return clube1Vermelho;
    }

    public void setClube1Vermelho(int clube1Vermelho) {
        this.clube1Vermelho = clube1Vermelho;
    }

    public int getClube2Vermelho() {
        return clube2Vermelho;
    }

    public void setClube2Vermelho(int clube2Vermelho) {
        this.clube2Vermelho = clube2Vermelho;
    }

}
