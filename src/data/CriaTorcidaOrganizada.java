package data;

import main.Clube;
import main.TorcidaOrganizada;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaTorcidaOrganizada {

    public static TorcidaOrganizada criaTorcidaInter(ArrayList<Clube> clubes){
        return new TorcidaOrganizada("Popular", clubes);
    }

    public static TorcidaOrganizada criaTorcidaGremio(ArrayList<Clube> clubes){
        return new TorcidaOrganizada("Geral", clubes);
    }
}
