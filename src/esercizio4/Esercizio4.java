package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void contoRovescia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        int numero = scanner.nextInt();

        System.out.println("Conto alla rovescia:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
