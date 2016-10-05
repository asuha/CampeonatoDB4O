package data;

import main.Clube;
import main.Patrocinador;

import java.util.ArrayList;

/**
 * Created by juliorenner on 10/5/16.
 */
public final class CriaPatrocinador {

    public static Patrocinador criaPatrocinador(ArrayList<Clube> clubes){
        return new Patrocinador("Coca-Cola", clubes);
    }

}
