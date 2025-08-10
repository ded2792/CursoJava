public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // \n . imprimir un salto de linea
        var cadena1 = "Hola\n Mundo";
        System.out.println("cadena1 = " + cadena1);

        // '\t' - tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' - agregar una comilla simple
        var cadena3 = "Hola \' Mundo";

        // '\"' - agrega una comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);

        // '\\' - caracter de barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
