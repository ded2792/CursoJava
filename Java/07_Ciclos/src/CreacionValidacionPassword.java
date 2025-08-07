import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Creación y Validación de Password ***");
        var consola = new Scanner(System.in);
        String contrasenia;

        do {
            System.out.print("Crea una contraseña de al menos 6 caracteres: ");
            contrasenia = consola.nextLine();
            if (contrasenia.length() < 6) {
                System.out.println("La contraseña es muy corta. Intentalo de nuevo.");
            }
        } while (contrasenia.length() < 6);

        System.out.println("Password válido.");
    }
}
