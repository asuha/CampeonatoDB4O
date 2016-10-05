package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Campeonato implements Serializable {

	private static final long serialVersionUID = 1L;
    private String nome;
    private int nroClubes;
    private ArrayList<Rodada> rodadas;
    private ArrayList<ClassificacaoGeral> classificacaoGeral;

    public Campeonato (String nome, int nroClubes, ArrayList<Rodada> rodadas,
                       ArrayList<ClassificacaoGeral> classificacaoGeral){
        this.nome = nome;
        this.nroClubes = nroClubes;
        this.rodadas = rodadas;
        this.classificacaoGeral = classificacaoGeral;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNroClubes(){
        return this.nroClubes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNroClubes(int nroClubes) {
        this.nroClubes = nroClubes;
    }

    public ArrayList<ClassificacaoGeral> getClassificacaoGeral() {
        return classificacaoGeral;
    }

    public void setClassificacaoGeral(ArrayList<ClassificacaoGeral> classificacaoGeral) {
        this.classificacaoGeral = classificacaoGeral;
    }

    public ArrayList<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(ArrayList<Rodada> rodadas) {
        this.rodadas = rodadas;
    }
}
