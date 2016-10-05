package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Diretor implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
    private ArrayList<Clube> clubes;

	public Diretor(String nome, ArrayList<Clube> clubes){
		this.nome = nome;
        this.clubes = clubes;
	}

    public ArrayList<Clube> getClubes() {
        return this.clubes;
    }

    public void setClubes(ArrayList<Clube> clubes) {
        this.clubes = clubes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
