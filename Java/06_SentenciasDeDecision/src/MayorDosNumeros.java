import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Mayor entre dos números ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        var num1 = consola.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        var num2 = consola.nextInt();

        int mayor = num1;
        if (mayor < num2) {
            mayor = num2;
            System.out.println("El numero " + num2 + " es el mayor de los dos numeros comparados");
        } else {
            System.out.println("El numero " + num1 + " es el mayor de los dos numeros comparados");
        }
    }
}
