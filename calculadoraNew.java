import java.util.Scanner;

/**
 *
 * @author mikel1
 */
public class CalculadoraNew {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String respuesta = "s";
        while (respuesta.equalsIgnoreCase("s")) {
            // Lógica del programa
            double num1 = introducirDouble();
            menu(); // Llama al método menu
            String operacion = introducirString();
            double num2 = introducirDouble();
            double resultado = switch1(operacion, num1, num2);
            System.out.println("El resultado es " + resultado);

            // Preguntar si desea continuar
            System.out.println("¿Deseas continuar? (s/n):");
            respuesta = teclado.next();
        }

        System.out.println("Programa terminado.");
        teclado.close();
    }

    private static double introducirDouble() {
        boolean valido = false;
        double num = 0;
        while (!valido) { // Se repite mientras la variable valido sea falso
            System.out.println("Introduce un número:");
            if (teclado.hasNextDouble()) {
                num = teclado.nextDouble();
                valido = true;
            } else {
                System.out.println("Has introducido un número no válido.");
                teclado.next();
            }
        }
        return num;
    }

    private static String introducirString() {
        boolean valido = false;
        String texto = "";
        while (!valido) { // Se repite mientras la variable valido sea falso
            System.out.println("Introduce un texto que no esté vacío:");
            texto = teclado.next();
            if (!texto.trim().isEmpty()) {
                valido = true; // Establece valido a true para salir del bucle
            } else {
                System.out.println("El texto no es válido.");
            }
        }
        return texto;
    }

    private static void menu() {
        System.out.println("\nElige la operación a realizar:");
        System.out
                .println("\n1. suma\n2. resta\n3. multiplicación\n4. división\n5. resto\n6. elevado\n7. raíz cuadrada");
    }

    // Métodos de operaciones
    private static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir entre 0.");
            return 0;
        }
    }

    private static double resto(double a, double b) {
        return a % b;
    }

    private static double suma(double a, double b) {
        return a + b;
    }

    private static double resta(double a, double b) {
        return a - b;
    }

    private static double multiplicacion(double a, double b) {
        return a * b;
    }

    private static double elevado(double a, double b) {
        return Math.pow(a, b);
    }

    private static double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    // Método switch
    private static double switch1(String operacion, double num1, double num2) {
        switch (operacion) {
            case "suma":
                return suma(num1, num2);
            case "resta":
                return resta(num1, num2);
            case "multiplicacion":
                return multiplicacion(num1, num2);
            case "division":
                return division(num1, num2);
            case "resto":
                return resto(num1, num2);
            case "elevado":
                return elevado(num1, num2);
            case "RaizCuadrada":
                return raizCuadrada(num1);
            default:
                System.out.println("Operación no válida.");
                return 0;
        }
    }
}