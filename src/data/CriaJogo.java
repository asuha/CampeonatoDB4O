package data;

import main.Campeonato;
import main.Jogo;
import main.Rodada;

/**
 * Created by juliorenner on 10/5/16.
 */
public class CriaJogo {

    public static Jogo criaJogo(Campeonato campeonato, Rodada rodada){
        return new Jogo(
                campeonato,
                rodada,
                CriaClube.criaInter(),
                CriaClube.criaGremio(),
                //Por esse resultado mais uns pontos por favor
                1, //Gols Inter
                2, //Gols Gremio
                0, //Pontos Inter
                3, //Pontos Gremio
                1, //Amarelos Inter
                2, //Amarelos Gremio
                0, //Vermelhos Inter
                0  //Vermelhos Gremio
                );
    }
}
