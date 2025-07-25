public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando el metdo concat = " + cadena3);

        // StringBuilder
        var  contructorCadenas = new StringBuilder();
        contructorCadenas.append(cadena1);
        contructorCadenas.append(" ");
        contructorCadenas.append(cadena2);
        var resultado = contructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado stringBuffer = " + resultado);

        // Join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado join = " + resultado);
    }
}
