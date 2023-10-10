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

    public void ottieniTelefonoPerNome(String nome) {
        System.out.println(rubrica.get(nome));
    }

    public void stampaRubrica() {
        for (Map.Entry<String, Long> entry : rubrica.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public String ottieniContattoPerTelefono(long telefono) {
        for (Map.Entry<String, Long> entry : rubrica.entrySet()) {
            if (entry.getValue() == telefono) {
                return entry.getKey();
            }
        }
        return null;
    }


}
