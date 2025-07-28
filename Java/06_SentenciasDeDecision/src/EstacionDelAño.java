import java.util.Scanner;

public class EstacionDelAño {
    public static void main(String[] args) {
        System.out.println("*** Estacion del año ***");

        var consola = new Scanner(System.in);
        System.out.print("Cual es el mes del año?: ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes < 1 || mes > 12) {
            System.out.println("Estación desconocida");
        } else if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Estamos en invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Estamos en primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Estamos en verano");
        } else {
            System.out.println("Estamos en otoño");
        }
    }
}
