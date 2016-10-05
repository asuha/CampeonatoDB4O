package data;

import main.Posicao;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaPosicao {

    public static Posicao criaGoleiro(){
        return new Posicao("Goleiro");
    };

    public static Posicao criaZagueiro(){
        return new Posicao("Zagueiro");
    }

    public static Posicao criaLateral(){
        return new Posicao("Lateral");
    }

    public static Posicao criaMeioCampo(){
        return new Posicao("Meio Campo");
    }

    public static Posicao criaAtacante(){
        return new Posicao("Atacante");
    }

}
