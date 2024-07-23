package esercizio1;

import java.util.Scanner;

public class Esercizio1 {

    public static boolean stringaDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola per vedere se ha un numero di caratteri pari o dispari");
        String inserisciStringa = scanner.nextLine();

        if (inserisciStringa.length() % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0) || anno % 100 != 0 && anno % 400 == 0;
    }


}
