import java.util.Scanner;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        System.out.println("*** Aplicacion de Calculadora ***");
        var consola = new Scanner(System.in);

        System.out.println("Para empezar a operar ingresa dos valores.");

        System.out.print("Operando 1: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Operando 2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var salir = false;
        var resultado = 0;

        while (!salir) {
            System.out.print("""
                    Operaciones disponibles:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una operación:\s""");
            var operacion = consola.nextInt();
            consola.nextLine();

            switch (operacion){
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.print("El resultado operando 1 + operando 2 es: " + resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.print("El resultado operando 1 - operando 2 es: " + resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.print("El resultado de operando 1 * operando 2 es: " + resultado);
                }
                case 4 -> {
                    resultado = operando1 / operando2;
                    System.out.print("El resultado de operando 1 / operando 2 es: " + resultado);
                }
            }
        }

    }
}
// Solución del curso
//
//import java.util.Scanner;
//
//public class Calculadora {
//    public static void main(String[] args) {
//        var consola = new Scanner(System.in);
//        double operando1 = 0, operando2 = 0, resultado;
//        var salir = false;
//        // Ciclo para la aplicacion de Calculadora
//        while(!salir){
//            System.out.print("""
//                    *** Calculadora en Java ***
//                    1. Suma
//                    2. Resta
//                    3. Multiplicación
//                    4. División
//                    5. Salir
//                    Escoge una opción:\s""");
//            var opcion = consola.nextInt();
//
//            if(opcion >= 1 && opcion <= 4){
//                System.out.print("Dame el valor 1: ");
//                operando1 = consola.nextDouble();
//                System.out.print("Dame el valor 2: ");
//                operando2 = consola.nextDouble();
//            }
//
//            switch(opcion){
//                case 1 -> { // Suma
//                    resultado = operando1 + operando2;
//                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
//                }
//                case 2 -> { // Resta
//                    resultado = operando1 - operando2;
//                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
//                }
//                case 3 -> { // Multiplicación
//                    resultado = operando1 * operando2;
//                    System.out.printf("Resultado multiplicación: %.2f%n%n", resultado);
//                }
//                case 4 -> { // División
//                    if(operando2 != 0) {
//                        resultado = operando1 / operando2;
//                        System.out.printf("Resultado división: %.2f%n%n", resultado);
//                    }
//                    else
//                        System.out.println("Error: División entre cero.\n");
//                }
//                case 5 -> { // Salir
//                    System.out.println("Saliendo del programa de Calculadora!");
//                    salir = true;
//                }
//                default -> System.out.println("Opción inválida, " +
//                        "selecciona otra opción...\n");
//            }
//        }
//    }
//}
