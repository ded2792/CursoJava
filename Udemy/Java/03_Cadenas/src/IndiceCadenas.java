public class IndiceCadenas {
    public static void main(String[] args) {
        // Manejo de indices en un cadena
        var cadena1 = "Hola Mundo";
        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Esto recupera el caracter de 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Imprimir la letra M, indice 5
        var quintoCaracter = cadena1.charAt(5);
        System.out.println("quintoCaracter = " + quintoCaracter);
    }
}
