package main;

import java.io.Serializable;

public class Posicao implements Serializable {

	private static final long serialVersionUID = 1L;
    private String nome;

	public Posicao(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }
}
