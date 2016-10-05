package data;

import main.Clube;
import main.Diretor;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaDiretor {

    private static ArrayList<String> nomesInter = setNomesInter();

    private static ArrayList<String> setNomesInter(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vitorio Pifero");
        nomes.add("Fernando Carvalho");

        return nomes;
    }

    private static ArrayList<String> nomesGremio = setNomesGremio();

    private static ArrayList<String> setNomesGremio(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Romildo Bolzan");
        nomes.add("Fabio Koff");

        return nomes;
    }

    public static Diretor criaDiretorInter(ArrayList<Clube> clubes){
        return new Diretor(nomesInter.remove(0), clubes);
    }

    public static Diretor criaDiretorGremio(ArrayList<Clube> clubes){
        return new Diretor(nomesGremio.remove(0), clubes);
    }


}
