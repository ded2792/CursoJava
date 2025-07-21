import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");
        final var USER = "admin";
        final int PASSWORD = 1234;
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu usuario? ");
        var userIngresado = consola.nextLine();
        System.out.print("Cual es tu contraseña? ");
        var passwordIngresada = Integer.parseInt(consola.nextLine());

        var datosCorrectos = USER.equals(userIngresado) && PASSWORD == passwordIngresada;
        System.out.print("Datos son correctos? " + datosCorrectos);
    }
}
