import java.util.Scanner;

public class EstacionDelAñoSwitch {
    public static void main(String[] args) {
        System.out.println("*** Estacion del año ***");

        var consola = new Scanner(System.in);
        System.out.print("Cual es el mes del año?: ");
        var mes = Integer.parseInt(consola.nextLine());

        switch (mes) {
            case 12, 1, 2 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
            default -> System.out.println("Estación desconocida");
        }

    }
}
