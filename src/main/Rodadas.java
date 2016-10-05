package main;

import java.io.Serializable;

public class Rodadas implements Serializable {

	private static final long serialVersionUID = 1L;
    private int totalJogos;
    private int totalGols;
    private int totalAmarelos;
    private int totalVermelhos;
    private Jogador artilheiro;
    private Campeonato campeonato;

    public Rodadas(int totalJogos, int totalGols, int totalAmarelos, int totalVermelhos,
                   Jogador artilheiro, Campeonato campeonato) {
        this.totalJogos = totalJogos;
        this.totalGols = totalGols;
        this.totalAmarelos = totalAmarelos;
        this.totalVermelhos = totalVermelhos;
        this.artilheiro = artilheiro;
        this.campeonato = campeonato;
    }

    public int getTotalJogos() {
        return totalJogos;
    }

    public void setTotalJogos(int totalJogos) {
        this.totalJogos = totalJogos;
    }

    public int getTotalGols() {
        return totalGols;
    }

    public void setTotalGols(int totalGols) {
        this.totalGols = totalGols;
    }

    public int getTotalAmarelos() {
        return totalAmarelos;
    }

    public void setTotalAmarelos(int totalAmarelos) {
        this.totalAmarelos = totalAmarelos;
    }

    public int getTotalVermelhos() {
        return totalVermelhos;
    }

    public void setTotalVermelhos(int totalVermelhos) {
        this.totalVermelhos = totalVermelhos;
    }

    public Jogador getArtilheiro() {
        return artilheiro;
    }

    public void setArtilheiro(Jogador artilheiro) {
        this.artilheiro = artilheiro;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
