import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu nota? ");
        var nota = Integer.parseInt(consola.nextLine());


        if (nota < 0 || nota > 10) {
            System.out.println("Valor desconocido.");
        } else if (nota >= 9) {
            System.out.println("Tu nota es una A");
        } else if (nota >= 8) {
            System.out.println("Tu nota es una B");
        } else if (nota >= 7) {
            System.out.println("Tu nota es una C");
        } else if (nota >= 6) {
            System.out.println("Tu nota es una D");
        } else {
            System.out.println("Tu nota es una F");
        }
    }
}
