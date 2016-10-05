package test;

/**
 * Created by juliorenner on 10/5/16.
 */

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.ObjectInfo;
import data.CriaCampeonato;
import main.Campeonato;

import java.util.ArrayList;
import java.util.List;

public class CampeonatoCommit {

    public static void main(String[] args){

        ObjectContainer db = Db4oEmbedded.openFile("campeonato.db");
        Campeonato campeonato = CriaCampeonato.criaCampeonato();

        db.store(campeonato);
        db.commit();

        List<Campeonato> campeonatos = new ArrayList<>();
        campeonatos = db.query(Campeonato.class);
        for (Campeonato each : campeonatos) {
            ObjectInfo objectInfo = db.ext().getObjectInfo(each);
            System.out.println("ID gerado: " + objectInfo.getInternalID() + " Nome: " + each.getNome());
        }

        db.close();

    }
}