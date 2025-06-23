public class DetalleProducto {
    public static void main(String[] args) {
        //Declaracion
        String nombreProducto = "Hojas";
        double precio = 50.0;
        int cantidadDisponible = 1000;
        boolean disponible = true;
        //Salida
        System.out.println("Nombre del producto = " + nombreProducto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        System.out.println("Disponibilidad = " + disponible);
        //Modificacion
        nombreProducto = "Mochilas";
        precio = 120.55;
        cantidadDisponible = 0;
        disponible = false;
        //Nueva salida
        System.out.println();
        System.out.println("Nombre del producto = " + nombreProducto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        System.out.println("Disponibilidad = " + disponible);

    }
}
