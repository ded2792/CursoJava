import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        var consola = new Scanner(System.in);
        // Ingreso de datos
        System.out.print("Nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingredientes principales: ");
        var ingredientesPrincipales = consola.nextLine();
        System.out.print("Tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Dificultad (Facil, Media, Alta): ");
        var dificultad = consola.nextLine();
        // Salida
        System.out.println("\n--- Receta de cocina ---");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesPrincipales);
        System.out.println("Tiempo de preparacion = " + tiempoPreparacion + " min.");
        System.out.println("Dificultad = " + dificultad);
    }
}
