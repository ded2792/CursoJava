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
