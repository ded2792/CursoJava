import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio banana: ");
        var precioBanana = Double.parseDouble(consola.nextLine());

        // Calculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioBanana;

        // Calculo con impuestos
        var impuesto = subtotal * 0.21;

        // Calculo total
        var costoTotal = subtotal + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de venta---------------
                Subtotal: $%.2f
                Impuesto (21%%d): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, impuesto, costoTotal);
    }
}
