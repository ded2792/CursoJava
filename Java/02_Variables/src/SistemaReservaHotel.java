public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de Hoteles ***");
        var nombreCliente = "Diego Delgado";
        var diasEstancia = 7;
        var tarifaDiaria = 25.50D;
        var vistaMar = true;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);
        System.out.println();
        nombreCliente = "Ezequiel Delgado";
        diasEstancia = 3;
        tarifaDiaria = 20.0D;
        vistaMar = false;
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + vistaMar);
    }
}
