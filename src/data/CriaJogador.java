package data;

import main.Clube;
import main.Jogador;
import main.Posicao;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public abstract class CriaJogador {

    private final ArrayList<String> nomes = setNomes();

    public abstract ArrayList<String> setNomes();

    public Jogador criaJogador(Posicao posicao, Clube clube){
        return new Jogador( nomes.remove(0) , posicao, clube);
    }



}
