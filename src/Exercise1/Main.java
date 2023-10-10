package Exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di parole da inserire (N): ");
            int N = input.nextInt();
            input.nextLine();

            Set<String> words = new HashSet<>();
            List<String> duplicateWords = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                System.out.print("Inserisci una parola: ");
                String word = input.nextLine();

                if (!words.add(word)) {
                    duplicateWords.add(word);
                }
            }

            System.out.println("Le parole duplicate sono:");
            for (String word : duplicateWords) {
                System.out.println(word);
            }
            System.out.println("Il numero di parole distinte è: " + words.size());

            System.out.println("Le parole distinte sono: ");
            for (String word : words) {
                System.out.println(word);
            }

        } catch (Exception ex) {
            System.err.println("Errore generico: " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}