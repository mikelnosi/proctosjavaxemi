import java.util.Scanner;

public class calculadora {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = introducirDouble();

        menu();
        String operacion = introducirString();

        double num2 = introducirDouble();

        double resultado = switch1(operacion, num1, num2);

        System.out.print("\nEl resultado es: " + resultado);

        teclado.close();
    }

    private static double introducirDouble() {
        boolean valido = false;
        double num = 0;

        while (!valido) {
            System.out.print("Introduce un numero: ");
            if (teclado.hasNextDouble()) {
                num = teclado.nextDouble();
                valido = true;
            } else {
                System.out.println("El numero introducido no es valido");
                teclado.next();
            }
        }
        return num;
    }

    private static String introducirString() {
        boolean valido = false;
        String texto = "";

        while (!valido) {
            System.out.print("Introduce un texto que no este vacio: ");
            texto = teclado.next();
            if (!texto.trim().isEmpty()) {
                valido = true;
            } else {
                System.out.println("El texto introducido no es valido");
            }
        }
        return texto;
    }

    private static void menu() {
        System.out.print("\nElige la operacion a realizar: ");
        System.out.print("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n");
    }

    private static double division(double a, double b) {
        double resultado = 0;
        if (b != 0)
            resultado = a / b;
        else
            System.out.println("No se puede dividir entre 0");
        return resultado;
    }

    private static double suma(double a, double b) {
        double resultado = 0;
        resultado = a + b;
        return resultado;
    }

    private static double resta(double a, double b) {
        double resultado = 0;
        resultado = a - b;
        return resultado;
    }

    private static double multiplicar(double a, double b) {
        double resultado = 0;
        resultado = a * b;
        return resultado;
    }

    private static double switch1(String operacion, double num1, double num2) {
        switch (operacion) {
            case "Suma":
            case "suma":
            case "sumar":
            case "+":
            case "1":
                return suma(num1, num2);
            case "2":
            case "resta":
            case "restar":
            case "Restar":
                return resta(num1, num2);
            case "3":
            case "multiplicar":
            case "multiplicacion":
            case "Multiplicar":
                return multiplicar(num1, num2);
            case "division":
            case "dividir":
            case "/":
            case "4":
                return division(num1, num2);
            default:
                return 0;
        }
    }

}
