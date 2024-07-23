import java.util.Scanner;

import static esercizio1.Esercizio1.annoBisestile;
import static esercizio1.Esercizio1.stringaDispari;
import static esercizio3.Esercizio3.separaCaratteri;
import static esercizio4.Esercizio4.contoRovescia;
import static essercizio2.Esercizio2.stampaNumero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("ESERCIZIO 1");

        boolean risultato = stringaDispari();
        System.out.println("La parola inserita è dispari?" + " " + risultato);

        System.out.println("Inserisci un anno per verificare se è bisestile:");
        int anno = scanner.nextInt();
        boolean annoResult = annoBisestile(anno);
        System.out.println("L'anno inserito è bisestile? " + annoResult);


        System.out.println("ESERCIZIO 2");

        System.out.println("Inserisci un numero intero.");
        int numero = scanner.nextInt();
        stampaNumero(numero);

        System.out.println("ESERCIZIO 3");

        separaCaratteri();

        System.out.println("ESERCIZIO 4");
        contoRovescia();
    }
}


