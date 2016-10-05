package data;

import main.Campeonato;
import main.ClassificacaoRodada;
import main.Clube;
import main.Rodada;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaClassificacaoRodada {

    public static ClassificacaoRodada criaClassificacaoRodadaPrimeiro(Clube clube, Campeonato campeonato, Rodada rodada){
        return new ClassificacaoRodada(
                1,
                clube,
                campeonato,
                rodada
        );
    }

    public static ClassificacaoRodada criaClassificacaoRodadaSegundo(Clube clube, Campeonato campeonato, Rodada rodada){
        return new ClassificacaoRodada(
                2,
                clube,
                campeonato,
                rodada
        );
    }

}
