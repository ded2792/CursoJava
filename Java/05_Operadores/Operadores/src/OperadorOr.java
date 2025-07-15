public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador OR ***");
        boolean a = true, b = false, c = false;
        // OR (da falso si ambos son falsos)
        var resultado = a || b;
        System.out.println("resultado = " + resultado);
        resultado = b || c;
        System.out.println("resultado = " + resultado);
    }
}
