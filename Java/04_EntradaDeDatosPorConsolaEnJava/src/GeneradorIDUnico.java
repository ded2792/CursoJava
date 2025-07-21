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
        System.out.print("Año de nacimiento (xxxx): ");
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

//        // Version del curso
//        // Pedir datos
//        System.out.println("*** Sistema de Generador de ID Unico ***");
//        System.out.print("Cual es tu nombre? ");
//        var nombre = consola.nextLine();
//        System.out.print("Cual es tu apellido? ");
//        var apellido = consola.nextLine();
//        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
//        var anioNacimiento = consola.nextLine();
//        // Normalizar los valores
//        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
//        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
//        var anioNacimiento2 = anioNacimiento.trim().substring(2);
//        // Generar aleatorio
//        var numeroAleatorio = aleatorio.nextInt(9999) + 1;
//        // Formato 4 digitos
//        var numeroAleatorioFormato = String.format("%04d" , numeroAleatorio);
//        // Generar el ID
//        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;
//        // Salida
//        System.out.printf("""
//                %Hola %s,
//                \tTu nuevo numero de identificacion (ID) fenerado por el sistema es:
//                \t%s
//                \t¡Felicitacions!
//                """, nombre, idUnico);
    }
}
