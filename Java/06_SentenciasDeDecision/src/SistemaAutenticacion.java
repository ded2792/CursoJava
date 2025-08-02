import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var USUARIO = "admin";
        final int CONTRASENIA = 1234;

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre de usuario? ");
        var usuarioIngresado = consola.nextLine();
        System.out.print("Cúal es tu contraseña (solo numeros)? ");
        var contraseniaIngresada = Integer.parseInt(consola.nextLine());

        boolean usuarioCorrecto = USUARIO.equals(usuarioIngresado);
        boolean contraseniaCorrecta = CONTRASENIA == contraseniaIngresada;

        if (usuarioCorrecto && contraseniaCorrecta){
            System.out.println("Bienvenido al sistema.");
        } else if (!usuarioCorrecto && contraseniaCorrecta){
            System.out.println("Usuario incorrecto.");
        } else if (usuarioCorrecto && !contraseniaCorrecta){
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario y Contraseña incorrectos.");
        }

    }
}
