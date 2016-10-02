package test;

/**
 * Created by juliorenner on 9/29/16.
 */

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.ObjectInfo;
import main.Jogador;

import java.util.ArrayList;
import java.util.List;

public class JogadorTest {

    public static void main(String[] args) {
        // Criando ou abrindo o banco de dados
        ObjectContainer db = Db4oEmbedded.openFile("jogador.db");
        List<Jogador> jogadores = new ArrayList<>();


        // Inserir objeto
		db.store(new Jogador("Pedro"));
		db.commit();

		/* Atualizar objeto
		fruteiras = db.queryByExample(new Fruteira("Fruteira 5x0"));
		if (!fruteiras.isEmpty()) {
			fruteiras.get(0).setNome("Fruteira 6x0");
			db.store(fruteiras.get(0));
			db.commit();
		}
		*/

		/* Deletar objeto
		fruteiras = db.queryByExample(new Fruteira("Fruteira 6x0"));
		if (!fruteiras.isEmpty()) {
			db.delete(fruteiras.get(0));
			db.commit();
		}
		*/

		/* Recuperar somente um objeto
		fruteiras = db.query(new Predicate<Fruteira>() {
			public boolean match(Fruteira f) {
				return f.getNome().equals("Fruteira 5x0");
			}
		});
		*/

        // Recuperar todos objetos
        jogadores = db.query(Jogador.class);
        for (Jogador each : jogadores) {
            ObjectInfo objectInfo = db.ext().getObjectInfo(each);
            System.out.println("ID gerado: " + objectInfo.getInternalID() + " Nome: " + each.getNome());
        }

        db.close();
    }

}
