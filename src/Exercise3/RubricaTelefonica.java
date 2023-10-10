package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, Long> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    @Override
    public String toString() {
        return "RubricaTelefonica{" +
                "rubrica=" + rubrica +
                '}';
    }

    public void inserisciContatto(String nome, long telefono) {
        rubrica.put(nome, telefono);
    }

    public void rimuoviContatto(String nome) {
        rubrica.remove(nome);
    }

    public String ottieniContatto(long telefono) {
        for (Map.Entry<String, Long> entry : rubrica.entrySet()) {
            if (entry.getValue() == telefono) {
                return entry.getKey();
            }
        }
        return null;
    }


}
