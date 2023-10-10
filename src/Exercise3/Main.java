package Exercise3;

public class Main {
    public static void main(String[] args) {

        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

        rubricaTelefonica.inserisciContatto("aldo", 320303202);
        rubricaTelefonica.inserisciContatto("giovanni", 304590278);
        rubricaTelefonica.inserisciContatto("giacomo", 359084038);

        System.out.println(rubricaTelefonica);

        rubricaTelefonica.rimuoviContatto("aldo");
        System.out.println(rubricaTelefonica);


        System.out.println(rubricaTelefonica.ottieniContatto(304590278));

    }


}
