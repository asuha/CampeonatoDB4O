package data;

import main.*;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public class CriaCampeonato {

    public static Campeonato criaCampeonato(){
        ArrayList<Rodada> rodadas = new ArrayList<>();
        ArrayList<Jogo> jogos = new ArrayList<>();
        ArrayList<ClassificacaoGeral> classificacaoGeral = new ArrayList<>();
        ArrayList<ClassificacaoRodada> classificacaoRodadas = new ArrayList<>();

        Campeonato campeonato = new Campeonato(
                "Grenal",
                2,
                null,
                null
        );

        Rodada rodada = new Rodada(null, campeonato, null, null);
        rodadas.add(rodada);

        Jogo jogo = CriaJogo.criaJogo(campeonato, rodada);
        jogos.add(jogo);

        rodada.setJogos(jogos);
        rodada.setArtilheiro(jogo.getClube2().getJogador10());

        ClassificacaoGeral classificacaoGremio =
                CriaClassificacaoGeral.criaPrimeiroColocado(jogo.getClube2(), campeonato);
        ClassificacaoGeral classificacaoInter =
                CriaClassificacaoGeral.criaSegundoColocado(jogo.getClube1(), campeonato);

        classificacaoGeral.add(classificacaoGremio);
        classificacaoGeral.add(classificacaoInter);

        ClassificacaoRodada classificacaoRodadaGremio =
                CriaClassificacaoRodada.criaClassificacaoRodadaPrimeiro(jogo.getClube2(), campeonato, rodada);
        ClassificacaoRodada classificacaoRodadaInter =
                CriaClassificacaoRodada.criaClassificacaoRodadaSegundo(jogo.getClube1(), campeonato, rodada);

        classificacaoRodadas.add(classificacaoRodadaGremio);
        classificacaoRodadas.add(classificacaoRodadaInter);


        rodada.setClassificacaoRodadas(classificacaoRodadas);

        campeonato.setClassificacaoGeral(classificacaoGeral);
        campeonato.setRodadas(rodadas);

        return campeonato;
    }
}
