package esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void separaCaratteri() {
        Scanner scanner = new Scanner(System.in);
        String stringaIn = null;

        while (true) {
            if (stringaIn != null && stringaIn.equals(":q")) break;
            System.out.println("Inserisci una stringa");
            stringaIn = scanner.nextLine();
            char[] arrayChar = stringaIn.toCharArray();
            String result = "";
            for (int i = 0; i < arrayChar.length; i++) {
                result += arrayChar[i];
                result += ",";
            }
            System.out.println(result);
        }

        System.out.println("Fine dei giochi!");
    }


}
