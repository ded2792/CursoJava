public class TIpoVar {
    public static void main(String[] args) {
        System.out.println("*** Use de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Diego";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Ezequiel";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usan var
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Se infiere el tipo boolean
        System.out.println("esCasado = " + esCasado);
        //esCasado = "No"; No se puede asignar un tipo distinto al que se uso al declarar la variable

        //Se tiene que definir el valor en el momento al usar var
        // Se tiene que poder inferir el tipo de dato, no usar null por ejemplo
    }
}
