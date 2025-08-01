import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        final double ENVIO_NACIONAL = 10;
        final double ENVIO_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es el destino (nacional/internacional)? ");
        String destino = consola.nextLine().toLowerCase().trim();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        double peso = Double.parseDouble(consola.nextLine());

        double tarifa;

        if (destino.equals("nacional")) {
            tarifa = ENVIO_NACIONAL;
        } else if (destino.equals("internacional")) {
            tarifa = ENVIO_INTERNACIONAL;
        } else {
            System.out.println("Destino no válido. Debe ser 'nacional' o 'internacional'.");
            return; // corta la ejecución si el destino no es válido
        }

        double costoTotal = peso * tarifa;
        System.out.println("El costo de envío del paquete es: $" + costoTotal);
    }
}
