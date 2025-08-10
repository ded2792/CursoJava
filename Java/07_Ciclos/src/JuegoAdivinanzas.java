import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");
        Random random = new Random();
        int numSecreto = random.nextInt(50) + 1; // 1-50
        Scanner consola = new Scanner(System.in);

        int contador = 0;
        int numUsuario;

        do {
            System.out.print("¿Qué número creés que salió (1-50)? ");
            numUsuario = consola.nextInt();
            contador++;

            if (numUsuario < numSecreto) {
                System.out.println("Muy bajo, probá con un número más grande.\n");
            } else if (numUsuario > numSecreto) {
                System.out.println("Muy alto, probá con un número más chico.\n");
            }

        } while (numUsuario != numSecreto);

        System.out.println("¡Acertaste! El número secreto era " + numSecreto +
                " y lo encontraste en " + contador + " intentos.");
    }
}
