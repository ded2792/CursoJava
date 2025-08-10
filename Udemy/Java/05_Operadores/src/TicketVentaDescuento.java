import java.util.Scanner;

public class TicketVentaDescuento {

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

        System.out.print("Aplicar algun descunto (%)? ");
        var descuntoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioBanana;

        // Aplicar descunto
        var descuento = subtotal * (descuntoPorcentaje / 100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Calculo con impuestos
        var impuesto = subtotalConDescuento * 0.21;

        // Calculo total
        var costoTotal = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de venta---------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (21%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuntoPorcentaje, impuesto, costoTotal);
    }
}
