public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena, el ultimo subindice que se use no lo va a incluir por eso usar uno mas
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5); // Tambien se puede declarar el indice de inicio solamente y va a usar todos hasta el final
        System.out.println("subcadena2 = " + subcadena2);
    }
}
