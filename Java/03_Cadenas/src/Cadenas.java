public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Cadena multiples lineas (text bolck)
        var cadena4 = """
                Este es un texto
                multilinea
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
