public class OperdorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        boolean a = true, b = false, c = true;
        // and (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        resultado = a && c;
        System.out.println("resultado = " + resultado);
    }
}
