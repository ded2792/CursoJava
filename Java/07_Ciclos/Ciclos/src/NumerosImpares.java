public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Impares ***");

        var contador = 0;

        while (contador <= 20) {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        }
    }
}
