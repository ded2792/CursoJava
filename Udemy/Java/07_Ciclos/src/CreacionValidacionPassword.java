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
// Solución del curso
//
//import java.util.Scanner;
//
//public class ValidacionPassword {
//    public static void main(String[] args) {
//        var consola = new Scanner(System.in);
//
//        System.out.println("*** Validación de Password ***");
//
//        System.out.print("Ingresa un password (de al menos 6 caracteres): ");
//        var password = consola.nextLine();
//
//        // Valida el password
//        while (password.length() < 6){
//            System.out.println("El password no cumple con los requisitos. " +
//                    "Debe tener al menos 6 caracteres");
//            System.out.print("Ingresa un nuevo valor de password: ");
//            password = consola.nextLine();
//        }
//        System.out.println("El valor de password es válido: " + password);
//    }
//}
