public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        // Ejemplo breack, imprimir solo el primer numero par
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo continue, imprimir solo numeros pares, ignorar impares
        System.out.println("\nPalabra continue: ");
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 1) { // numero impar
                continue;// saltamos a la siguiente iterecion
            }
            System.out.print(numero + " "); // numeros pares
        }
    }
}
