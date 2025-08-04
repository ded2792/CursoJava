import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Aplicación Cajero Automatico ***");
        var consola = new Scanner(System.in);
        var saldo = 1000.00;
        var salir = false;

        while (!salir){
            System.out.println("""
                    Operaciones que podes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("El saldo actual es $" + saldo);
                }
                case 2 -> {
                    System.out.print("¿Cúanto queres retirar: ");
                    var montoUsuario = Double.parseDouble(consola.nextLine());
                    while (montoUsuario <= saldo && montoUsuario > 0){
                        if (montoUsuario <= saldo){
                            saldo = saldo - montoUsuario;
                            System.out.println("El saldo actual es $" + saldo);
                        } else {
                            System.out.println("Valor invalido. Igresar otro monto.");
                        }
                    }
                }
                case 3 -> {

                }
            }

        }
    }
}
