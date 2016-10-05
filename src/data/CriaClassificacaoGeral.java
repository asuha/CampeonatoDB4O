package data;

import main.Campeonato;
import main.ClassificacaoGeral;
import main.Clube;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaClassificacaoGeral {

    public static ClassificacaoGeral criaPrimeiroColocado(Clube clube, Campeonato campeonato){
        return new ClassificacaoGeral(
                1,
                clube,
                campeonato
        );
    }

    public static ClassificacaoGeral criaSegundoColocado(Clube clube, Campeonato campeonato){
        return new ClassificacaoGeral(
                2,
                clube,
                campeonato
        );
    }
}
