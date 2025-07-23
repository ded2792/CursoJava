public class SentencaElseIf {
    public static void main(String[] args) {
        var edad = 16;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolecente");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
