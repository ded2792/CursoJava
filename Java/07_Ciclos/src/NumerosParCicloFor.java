public class NumerosParCicloFor {
    public static void main(String[] args) {
        System.out.println("*** Números pares con ciclo for del 0 al 20 ***");
        for (var i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
