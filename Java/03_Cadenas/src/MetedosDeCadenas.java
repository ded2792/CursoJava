public class MetedosDeCadenas {
    public static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("cadena1.toUpperCase = " + mayusculas);

        // Convertir a minusculas, se puede imprimir directamente, no es necesario asignar a una var
        System.out.println("cadena1.toLowerCase = " + cadena1.toLowerCase());

        // Eliminar espacios al inicio y al final
        var cadena2 = " Diego Delgado   ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios (al principio y al final) = " + cadena2.trim());
        
    }
}
