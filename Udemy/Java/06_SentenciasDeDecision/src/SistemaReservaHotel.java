import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema Reserva Hotel ***");

        // Declaracion de var
        final double CON_VISTA_MAR = 190.50;
        final double SIN_VISTA_MAR = 150.50;
        var consola = new Scanner(System.in);
        // Ingreso de datos
        System.out.print("Nombre del cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Dias de estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Con vista al mar (true/false)? ");
        var tipoVista = Boolean.parseBoolean(consola.nextLine());
        // Calculo de valores
        double costoTotal;
        if (tipoVista) {
            costoTotal = diasEstadia * CON_VISTA_MAR;
        } else {
            costoTotal = diasEstadia * SIN_VISTA_MAR;
        }
        // Salida
        String vistaTexto = tipoVista ? "Sí :)" : "No :(";
        System.out.printf("""
                ----- Detalles de la Reservación -----
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, vistaTexto);
    }
}
