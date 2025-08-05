import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Aplicación Cajero Automatico ***");
        var consola = new Scanner(System.in);
        var saldo = 1000.00;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    Operaciones que podes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();
            consola.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("El saldo actual es $" + saldo);
                }
                case 2 -> {
                    double montoUsuario;
                    do {
                        System.out.print("¿Cuánto querés retirar? ");
                        montoUsuario = Double.parseDouble(consola.nextLine());
                        if (montoUsuario <= 0) {
                            System.out.println("Monto inválido. Debe ser mayor a 0.");
                        } else if (montoUsuario > saldo) {
                            System.out.println("Saldo insuficiente. Tenés $" + saldo);
                        }
                    } while (montoUsuario <= 0 || montoUsuario > saldo);
                    saldo -= montoUsuario;
                    System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                }
                case 3 -> {
                    System.out.print("¿Cuánto vas a ingresar? ");
                    var montoUsuario = Double.parseDouble(consola.nextLine());
                    if (montoUsuario > 0) {
                        saldo += montoUsuario;
                        System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
                    } else {
                        System.out.println("Monto inválido. No se realizó el depósito.");
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Hasta pronto.");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }

        }
    }
}
// Solución del curso
//import java.util.Scanner;
//
//public class CajeroAutomatico {
//    public static void main(String[] args) {
//        var consola = new Scanner(System.in);
//        var saldo = 1000.0;
//        var salir = false;
//        // Menu de la aplicación
//        while(!salir){
//            System.out.print("""
//                    *** Aplicación de Cajero Automático ***
//                    Operaciones que puedes realizar:
//                    1. Consultar Saldo
//                    2. Retirar
//                    3. Depositar
//                    4. Salir
//                    Esocoge una opcion:\s""");
//            var opcion = consola.nextInt();
//            // Procesamos cada caso
//            switch (opcion){
//                case 1 -> System.out.printf("Tu saldo actual es: %.2f%n%n", saldo);
//                case 2 -> {
//                    System.out.print("Ingresa el monto a retirar: ");
//                    var retiro = consola.nextDouble();
//                    if(retiro <= saldo) {
//                        saldo -= retiro; // saldo = saldo - retiro
//                        System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
//                    }
//                    else
//                        System.out.printf("No cuentas con el saldo suficiente. " +
//                                "Saldo actual es: %.2f%n%n", saldo);
//                }
//                case 3 -> {
//                    System.out.print("Ingresa el monto a depositar: ");
//                    var deposito = consola.nextDouble();
//                    saldo += deposito; // saldo = saldo + deposito
//                    System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
//                }
//                case 4 -> {
//                    System.out.println("Saliendo del Cajero Automático. Hasta pronto!");
//                    salir = true;
//                }
//                default -> System.out.println("Opción inválida." +
//                        "Seleciona otra opción.\n");
//            }
//        }
//    }
//}
