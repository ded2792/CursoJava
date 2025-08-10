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
// Solucion del curso
//import java.util.Random;
//import java.util.Scanner;
//
//public class JuegoAdivinanzas {
//    public static void main(String[] args) {
//        System.out.println("*** Juego de Adivinanzas ***");
//        var consola = new Scanner(System.in);
//        var random = new Random();
//
//        // Generamos un número aleatorio entre 1 y 50
//        var numeroSecreto = random.nextInt(50) + 1;
//        var intentos = 0;
//        var adivinanza = 0;
//        final var INTENTOS_MAXIMOS = 5;
//
//        while(adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS){
//            System.out.print("Adivina el número secreto (1-50): ");
//            adivinanza = consola.nextInt();
//
//            // Agregar una ayuda para orientar al jugador
//            if(adivinanza < numeroSecreto)
//                System.out.println("El número secreto es mayor");
//            else if(adivinanza > numeroSecreto)
//                System.out.println("El número secreto es menor");
//
//            // Incrementamos la variable de intentos
//            intentos++;
//        }
//
//        // Conclusión del juego
//        if(adivinanza == numeroSecreto){
//            System.out.printf("Felicidades, " +
//                    "advinaste el número secreto en %d intentos%n", intentos);
//        }
//        else{
//            System.out.printf("Lo siento, has agotado tus intentos máximos: %d%n",
//                    INTENTOS_MAXIMOS);
//            System.out.printf("El número secreto era: %d%n", numeroSecreto);
//        }
//    }
//}
