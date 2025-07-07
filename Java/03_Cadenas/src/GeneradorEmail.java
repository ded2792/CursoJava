public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        var nombreUsuario = " Diego Ezequiel Delgado ";
        System.out.println("Nombre Usuario = " + nombreUsuario);
        String[] partes = nombreUsuario.toLowerCase().trim().split("\\s+");
        String nombreNormalizado = String.join(".", partes);
        System.out.println("Nombre de usuario normalizado = " + nombreNormalizado);
        System.out.println("");
        var nombreEmpresa = "Universidad Lanus";
        var dominio = ".com.ar";
        System.out.println("Nombre Empresa = " + nombreEmpresa);
        System.out.println("Extension del dominio = " + dominio);
        var dominioNormalizado =  "@" + nombreEmpresa.toLowerCase().replace(" ","") + dominio;
        System.out.println("Dominio del email Normalizado = " + dominioNormalizado);
        System.out.println();
        System.out.println("Email final generado: " + nombreNormalizado + dominioNormalizado);


//        // Version del curso
//        // Nombre completo del usuario
//        var nombreCompleto = " Ubaldo Acosta Soto  ";
//        System.out.println("nombreCompleto = " + nombreCompleto);
//        // Procesar o normalizar el nombre del usuario
//        // Limpiar los espacios
//        var nombreNormalizado = nombreCompleto.strip();
//        // Reemplazar los espacios en blanco por punto
//        nombreNormalizado = nombreNormalizado.replace(" ", ".");
//        // Pasar a minusculas
//        nombreNormalizado = nombreNormalizado.toLowerCase();
//        System.out.println("nombreNormalizado = " + nombreNormalizado);
//
//        // Datos de la empresa
//        var nombreEmpresa = " Global Mentoring ";
//        System.out.println("\nNombre Empresa = " + nombreEmpresa);
//        var extencionDominio = ".com.mx";
//        System.out.println("Extencion del dominio = " + extencionDominio);
//
//        // Sacar los espacios y pasar a minusculas
//        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
//        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extencionDominio;
//        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
//
//        // Email final
//        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
//        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}