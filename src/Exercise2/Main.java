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
            List<Integer> reversedList = new ArrayList<>(reverseList(integerList));

            for (Integer number : reversedList) {
                System.out.println(number);
            }
            System.out.println("numeri pari");
            printOddOrEven(true, integerList);
            System.out.println("numeri dispari");
            printOddOrEven(false, integerList);


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
        List<Integer> newList = new ArrayList<>(integerList);
        Collections.reverse(integerList);
        newList.addAll(integerList);
        return newList;
    }

    public static void printOddOrEven(boolean b, List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            int currentNumber = integerList.get(i);
            if (b && currentNumber % 2 == 0) {
                System.out.println(currentNumber);
            } else if (!b && currentNumber % 2 != 0) {
                System.out.println(currentNumber);
            }
        }
    }
}

