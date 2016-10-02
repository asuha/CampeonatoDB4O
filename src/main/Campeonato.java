package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Campeonato implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
    private String nome;
    private int nroClubes;
    private ArrayList<Rodadas> rodadas;
    private ArrayList<ClassificacaoGeral> classificacaoGeral;

    public Campeonato (String nome, int nroClubes, ArrayList<Rodadas> rodadas,
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
}
