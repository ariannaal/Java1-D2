package essercizio2;

public class Esercizio2 {
    public static void stampaNumero(int numero) {
        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: il numero inserito non è compreso tra 0 e 3!");
                break;

        }
    }
}
