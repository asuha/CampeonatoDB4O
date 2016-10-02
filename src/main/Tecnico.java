package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Tecnico implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
    private String nome;
    private ArrayList<Clube> clubes;

    public Tecnico(String nome, ArrayList<Clube> clubes){
        this.nome = nome;
        this.clubes = clubes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Clube> getClubes() {
        return clubes;
    }

    public void setClubes(ArrayList<Clube> clubes) {
        this.clubes = clubes;
    }


}
