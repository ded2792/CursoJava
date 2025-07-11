import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de IDs ***");
        // Ingreso de datos
        System.out.println("Completar los siguentes datos:");
        var consola = new Scanner(System.in);
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Año de nacimiento: ");
        var anioNacimiento = consola.nextLine();
        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;
        System.out.println("Numero Aleatorio entre 1 y 9999 = " + numeroAleatorio);
        var numeroFormateado = String.format("%04d", numeroAleatorio);

        // Generacion de ID unico
        var idUnico = nombre.substring(0, 2).toUpperCase() +
                apellido.substring(0, 2).toUpperCase() +
                anioNacimiento.substring(2, 4) +
                numeroFormateado;
        System.out.println("\nEl ID unico generado es: " + idUnico);
    }
}
