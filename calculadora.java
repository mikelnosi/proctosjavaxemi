import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, resultado = 0;
        String operacion;

        System.out.print("Introduce el numero a operar: ");

        num1 = teclado.nextDouble();

        System.out.print("\nElige la operacion a realizar: ");
        System.out.print("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n");

        operacion = teclado.next();

        System.out.print("\nIntroduce el  segundo numero a operar: ");

        num2 = teclado.nextDouble();

        teclado.close();

        resultado = switch1(operacion, num1, num2);

        System.out.print("\nEl resultado es: " + resultado);
    }

    private static double division(double a, double b) {
        double resultado = 0;
        if (b != 0) resultado = a / b;
        else System.out.println("No se puede dividir entre 0");
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
