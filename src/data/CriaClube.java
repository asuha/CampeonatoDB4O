package data;

import main.*;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaClube {

    public static Clube criaInter(){
        ArrayList<Clube> clubes = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<TorcidaOrganizada> torcidas = new ArrayList<>();
        ArrayList<Patrocinador> patrocinadores = new ArrayList<>();
        ArrayList<Diretor> diretores = new ArrayList<>();

        Clube clube = new Clube("Internacional");
        clubes.add(clube);

        Posicao goleiro   = CriaPosicao.criaGoleiro();
        Posicao zagueiro  = CriaPosicao.criaZagueiro();
        Posicao lateral   = CriaPosicao.criaLateral();
        Posicao meioCampo = CriaPosicao.criaMeioCampo();
        Posicao atacante  = CriaPosicao.criaAtacante();

        CriaJogadorInter criaJogadorInter = new CriaJogadorInter();

        Jogador j1 = criaJogadorInter.criaJogador(goleiro, clube);
        Jogador j2 = criaJogadorInter.criaJogador(zagueiro, clube);
        Jogador j3 = criaJogadorInter.criaJogador(zagueiro, clube);
        Jogador j4 = criaJogadorInter.criaJogador(lateral, clube);
        Jogador j5 = criaJogadorInter.criaJogador(lateral, clube);
        Jogador j6 = criaJogadorInter.criaJogador(meioCampo, clube);
        Jogador j7 = criaJogadorInter.criaJogador(meioCampo, clube);
        Jogador j8 = criaJogadorInter.criaJogador(meioCampo, clube);
        Jogador j9 = criaJogadorInter.criaJogador(meioCampo, clube);
        Jogador j10 = criaJogadorInter.criaJogador(atacante, clube);
        Jogador j11 = criaJogadorInter.criaJogador(atacante, clube);
        Jogador j12 = criaJogadorInter.criaJogador(goleiro, clube);
        Jogador j13 = criaJogadorInter.criaJogador(zagueiro, clube);
        Jogador j14 = criaJogadorInter.criaJogador(lateral, clube);
        Jogador j15 = criaJogadorInter.criaJogador(meioCampo, clube);
        Jogador j16 = criaJogadorInter.criaJogador(atacante, clube);


        Tecnico tecnico = CriaTecnico.criaTecnicoInter(clubes);
        tecnicos.add(tecnico);

        Diretor diretor = CriaDiretor.criaDiretorInter(clubes);
        diretores.add(diretor);

        TorcidaOrganizada torcidaOrganizada = CriaTorcidaOrganizada.criaTorcidaInter(clubes);
        torcidas.add(torcidaOrganizada);

        Patrocinador patrocinador = CriaPatrocinador.criaPatrocinador(clubes);
        patrocinadores.add(patrocinador);

        clube.setPatrocinadores(patrocinadores);
        clube.setTecnicos(tecnicos);
        clube.setTorcidasOrganizadas(torcidas);
        clube.setDiretores(diretores);
        clube.setJogador1(j1);
        clube.setJogador2(j2);
        clube.setJogador3(j3);
        clube.setJogador4(j4);
        clube.setJogador5(j5);
        clube.setJogador6(j6);
        clube.setJogador7(j7);
        clube.setJogador8(j8);
        clube.setJogador9(j9);
        clube.setJogador10(j10);
        clube.setJogador11(j11);
        clube.setJogador12(j12);
        clube.setJogador13(j13);
        clube.setJogador14(j14);
        clube.setJogador15(j15);
        clube.setJogador16(j16);

        return clube;
    }

    public static Clube criaGremio(){
        ArrayList<Clube> clubes = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<TorcidaOrganizada> torcidas = new ArrayList<>();
        ArrayList<Patrocinador> patrocinadores = new ArrayList<>();
        ArrayList<Diretor> diretores = new ArrayList<>();

        Clube clube = new Clube("Gremio");
        clubes.add(clube);

        Posicao goleiro   = CriaPosicao.criaGoleiro();
        Posicao zagueiro  = CriaPosicao.criaZagueiro();
        Posicao lateral   = CriaPosicao.criaLateral();
        Posicao meioCampo = CriaPosicao.criaMeioCampo();
        Posicao atacante  = CriaPosicao.criaAtacante();

        CriaJogadorGremio criaJogadorGremio = new CriaJogadorGremio();

        Jogador j1 = criaJogadorGremio.criaJogador(goleiro, clube);
        Jogador j2 = criaJogadorGremio.criaJogador(zagueiro, clube);
        Jogador j3 = criaJogadorGremio.criaJogador(zagueiro, clube);
        Jogador j4 = criaJogadorGremio.criaJogador(lateral, clube);
        Jogador j5 = criaJogadorGremio.criaJogador(lateral, clube);
        Jogador j6 = criaJogadorGremio.criaJogador(meioCampo, clube);
        Jogador j7 = criaJogadorGremio.criaJogador(meioCampo, clube);
        Jogador j8 = criaJogadorGremio.criaJogador(meioCampo, clube);
        Jogador j9 = criaJogadorGremio.criaJogador(meioCampo, clube);
        Jogador j10 = criaJogadorGremio.criaJogador(atacante, clube);
        Jogador j11 = criaJogadorGremio.criaJogador(atacante, clube);
        Jogador j12 = criaJogadorGremio.criaJogador(goleiro, clube);
        Jogador j13 = criaJogadorGremio.criaJogador(zagueiro, clube);
        Jogador j14 = criaJogadorGremio.criaJogador(lateral, clube);
        Jogador j15 = criaJogadorGremio.criaJogador(meioCampo, clube);
        Jogador j16 = criaJogadorGremio.criaJogador(atacante, clube);


        Tecnico tecnico = CriaTecnico.criaTecnicoGremio(clubes);
        tecnicos.add(tecnico);

        Diretor diretor = CriaDiretor.criaDiretorGremio(clubes);
        diretores.add(diretor);

        TorcidaOrganizada torcidaOrganizada = CriaTorcidaOrganizada.criaTorcidaGremio(clubes);
        torcidas.add(torcidaOrganizada);

        Patrocinador patrocinador = CriaPatrocinador.criaPatrocinador(clubes);
        patrocinadores.add(patrocinador);

        clube.setPatrocinadores(patrocinadores);
        clube.setTecnicos(tecnicos);
        clube.setTorcidasOrganizadas(torcidas);
        clube.setDiretores(diretores);
        clube.setJogador1(j1);
        clube.setJogador2(j2);
        clube.setJogador3(j3);
        clube.setJogador4(j4);
        clube.setJogador5(j5);
        clube.setJogador6(j6);
        clube.setJogador7(j7);
        clube.setJogador8(j8);
        clube.setJogador9(j9);
        clube.setJogador10(j10);
        clube.setJogador11(j11);
        clube.setJogador12(j12);
        clube.setJogador13(j13);
        clube.setJogador14(j14);
        clube.setJogador15(j15);
        clube.setJogador16(j16);

        return clube;
    }

}
