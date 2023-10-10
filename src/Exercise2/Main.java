package Exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di interi da inserire : ");
            int N = Integer.parseInt(input.nextLine());

            List<Integer> integerList = new ArrayList<>();
            fillIntegerList(N, integerList);


            System.out.println("Lista ordinata:");
            for (Integer number : integerList) {
                System.out.println(number);
            }
            System.out.println("Lista ordinata + lista inversa:");
            List<Integer> reversedList = reverseList(integerList);

            for (Integer number : reversedList) {
                System.out.println(number);
            }


        } catch (NumberFormatException ex) {
            System.err.println("Hai inserito un valore non numerico");
        } catch (Exception ex) {
            System.err.println("Errore generico: " + ex.getMessage());
        } finally {
            input.close();
        }

    }

    public static void fillIntegerList(int N, List<Integer> integerList) {
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            integerList.add(rand.nextInt(101));
        }
        Collections.sort(integerList);
    }

    public static List<Integer> reverseList(List<Integer> integerList) {
        List<Integer> reversedList = new ArrayList<>(integerList);
        Collections.reverse(reversedList);
        integerList.addAll(reversedList);
        return integerList;
    }
}
