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
