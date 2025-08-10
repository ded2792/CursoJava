import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Calculo area y perimetro de un rectangulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Cual es la base del rectangulo (cm)? ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Cual es la altura del rectangulo (cm)? ");
        var altura = Integer.parseInt(consola.nextLine());

        var perimetro = (base + altura) * 2;
        var area = base * altura;
        System.out.println("El area del rectangulo es " + area + "cm².");
        System.out.print("El perimetro del rectangulo es " + perimetro + "cm.");
    }
}
