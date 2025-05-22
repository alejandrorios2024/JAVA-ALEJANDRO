import java.util.Scanner;

public class CicloWhile {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje) {
        int numeroTemporal;

        System.out.print(mensaje + ": ");
        numeroTemporal = scanner.nextInt();

        while (numeroTemporal == 0) {
            System.out.println("El numero no puede ser cero. Intentalo de nuevo.");
            System.out.print(mensaje + ": ");
            numeroTemporal = scanner.nextInt();
        }

        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero = obtenerNumero("Ingresa un numero");
        int numero2 = obtenerNumero("Ingresa otro numero");

        System.out.println("Numeros validos: " + numero + " y " + numero2);
    }
}
