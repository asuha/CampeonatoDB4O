package data;

import main.Clube;
import main.Tecnico;
import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaTecnico {

    public static Tecnico criaTecnicoInter(ArrayList<Clube> clubes){
        return new Tecnico("Roth", clubes);
    }

    public static Tecnico criaTecnicoGremio(ArrayList<Clube> clubes){
        return new Tecnico("Renato Portalupi", clubes);
    }
}
