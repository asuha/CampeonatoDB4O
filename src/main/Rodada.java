package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Rodada implements Serializable {

	private static final long serialVersionUID = 1L;
    private int totalJogos;
    private int totalGols;
    private int totalAmarelos;
    private int totalVermelhos;
    private Jogador artilheiro;
    private Campeonato campeonato;
    private ArrayList<Jogo> jogos;
    private ArrayList<ClassificacaoRodada> classificacaoRodadas;

    public Rodada(Jogador artilheiro, Campeonato campeonato, ArrayList<Jogo> jogos, ArrayList<ClassificacaoRodada> classificacaoRodadas) {
        this.jogos = jogos;
        this.artilheiro = artilheiro;
        this.campeonato = campeonato;
        this.classificacaoRodadas = classificacaoRodadas;
        calculaDadosRodada();
    }

    public void calculaDadosRodada(){
        calculaTotalJogos();
        calculaTotalGols();
        calculaTotalAmarelos();
        calculaTotalVermelhos();
    }

    public void calculaTotalJogos(){
        if(jogos != null)
            setTotalJogos(this.jogos.size());
    }

    public void calculaTotalGols(){
        int totalGols = 0;

        if (jogos!= null) {
            Iterator<Jogo> iterator = jogos.iterator();
            while (iterator.hasNext()) {
                Jogo jogo = iterator.next();
                totalGols = +jogo.getClube1Gol() + jogo.getClube2Gol();
            }

        }
        setTotalGols(totalGols);
    }

    public void calculaTotalAmarelos(){
        int totalAmarelos = 0;

        if(jogos!=null) {
            Iterator<Jogo> iterator = jogos.iterator();
            while (iterator.hasNext()) {
                Jogo jogo = iterator.next();
                totalAmarelos = +jogo.getClube1Amarelo() + jogo.getClube2Amarelo();
            }
        }

        setTotalAmarelos(totalAmarelos);
    }

    public void calculaTotalVermelhos(){
        int totalVermelhos = 0;

        if(jogos != null) {
            Iterator<Jogo> iterator = jogos.iterator();
            while (iterator.hasNext()) {
                Jogo jogo = iterator.next();
                totalVermelhos = +jogo.getClube1Vermelho() + jogo.getClube2Vermelho();
            }
        }

        setTotalVermelhos(totalVermelhos);
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

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
        calculaDadosRodada();
    }

    public ArrayList<ClassificacaoRodada> getClassificacaoRodadas() {
        return classificacaoRodadas;
    }

    public void setClassificacaoRodadas(ArrayList<ClassificacaoRodada> classificacaoRodadas) {
        this.classificacaoRodadas = classificacaoRodadas;
    }
}

