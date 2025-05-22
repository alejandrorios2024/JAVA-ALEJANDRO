import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.pintln("Calculadora basica en Java");

        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador no valido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
