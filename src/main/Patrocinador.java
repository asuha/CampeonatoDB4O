package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Patrocinador implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
    private String nome;
    private ArrayList<Clube> clubes;

	public Patrocinador(String nome, ArrayList<Clube> clubes){
		this.nome = nome;
        this.clubes = clubes;
	}

    public void addClube(Clube clube){
        this.clubes.add(clube);
    }

    public ArrayList<Clube> getClubes() {
        return clubes;
    }

    public void setClubes(ArrayList<Clube> clubes) {
        this.clubes = clubes;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
