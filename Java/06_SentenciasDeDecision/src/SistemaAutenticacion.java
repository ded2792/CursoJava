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
// Solucion del curso
//import java.util.Scanner;
//
//public class SistemaAutenticacion {
//    public static void main(String[] args) {
//        System.out.println("*** Sistema de Autenticación ***");
//
//        final var USUARIO_VALIDO = "admin";
//        final var PASSWORD_VALIDO = "123";
//
//        var consola = new Scanner(System.in);
//
//        System.out.print("Ingresa tu usuario: ");
//        var usuario = consola.nextLine().strip();
//
//        System.out.print("Ingresa tu password: ");
//        var password = consola.nextLine().strip();
//
//        // Cada caso de validacion de usuario y password
//        var mensajeAutenticacion = switch (usuario){
//            case USUARIO_VALIDO -> {
//                if(PASSWORD_VALIDO.equals(password))
//                    yield "Bienvenido al Sistema!";
//                else
//                    yield "Password incorrecto, favor de corregirlo!";
//            }
//            default -> {
//                if(PASSWORD_VALIDO.equals(password))
//                    yield "Usuario incorrecto, favor de corregirlo!";
//                else
//                    yield "Usuario y password incorrectos, favor de corregirlos!";
//            }
//        };
//        // Imprimir el mensaje
//        System.out.println(mensajeAutenticacion);
//    }
//}
