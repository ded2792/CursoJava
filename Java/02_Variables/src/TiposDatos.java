public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java

        // Enteros (valor por default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Se agrega L o l para indicar el tipo de la literal
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (valor por default 0.0)
        float tipoFloat = 3.14F; // Se agrega F o f para indicar el tipo de la literal
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (valor por default'\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (referencias)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Diego";
        System.out.println("nombre = " + nombre);

    }
}
