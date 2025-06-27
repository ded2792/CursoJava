public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Diego Delgado"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "diego delgado"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Diego"; // Incorrecto
        String nombre_cliente = "Ezequiel"; // Correcto, no aplica buenas practicas
        String _apellido = "Delgado"; // Correcto y aceptable
        String $apellido = "Gonzalez"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcta, aplica buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, aplica buenas practica
    }
}
