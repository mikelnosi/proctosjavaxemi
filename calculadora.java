import java.util.Scanner;

public class calculadora {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;

        System.out.println("BIENVENIDO A LA CALCULADORA Mikel");

        while (!salir) {
            double num1 = introducirDouble();
            double num2 = 0;

            menu();
            String operacion = introducirString();

            if (!operacion.equals("raizcuadrada") && !operacion.equals("7") && !operacion.equals("raiz")) {
                num2 = introducirDouble();
            }

            double resultado = switch1(operacion, num1, num2);

            System.out.print("\nEl resultado es: " + resultado);

            salir = eleccionSalir();

        }

        teclado.close();
    }

    private static boolean eleccionSalir() {
        boolean salirEleccion = false;
        while (!salirEleccion) {
            System.out.println("\n¿Desea realizar otra operacion? (S/N)");
            String eleccion = introducirString().toLowerCase();

            if (eleccion.equals("n") || eleccion.equals("no")) {
                salirEleccion = true;
                return true;
            } else if (eleccion.equals("s") || eleccion.equals("si")) {
                salirEleccion = true;
                return false;
            } else {
                System.out.println("Opcion no valida, solamente acepta si o no");
            }
        }
        return false;
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
            texto = teclado.next().toLowerCase();
            if (!texto.trim().isEmpty()) {
                valido = true;
            } else {
                System.out.println("El texto introducido no es valido");
            }
        }
        return texto;
    }

    private static void menu() {
        System.out.println("\nElige la operacion a realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Resto");
        System.out.println("6. Elevado");
        System.out.println("7. Raiz Cuadrada");
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

    private static double elevado(double a, double b) {
        double resultado = 0;
        resultado = Math.pow(a, b);
        return resultado;
    }

    private static double RaizCuadrada(double a) {
        double resultado = 0;
        resultado = Math.sqrt(a);
        return resultado;
    }

    private static double resto(double a, double b) {
        double resultado = 0;
        resultado = a % b;
        return resultado;
    }

    private static double switch1(String operacion, double num1, double num2) {
        switch (operacion) {
            case "suma":
            case "sumar":
            case "+":
            case "1":
                return suma(num1, num2);
            case "2":
            case "resta":
            case "restar":
                return resta(num1, num2);
            case "3":
            case "multiplicar":
            case "multiplicacion":
                return multiplicar(num1, num2);
            case "division":
            case "dividir":
            case "/":
            case "4":
                return division(num1, num2);
            case "resto":
            case "%":
            case "5":
                return resto(num1, num2);
            case "elevado":
            case "potencia":
            case "6":
            case "^":
                return elevado(num1, num2);
            case "raizcuadrada":
            case "7":
            case "raiz":
                return RaizCuadrada(num1);
            default:
                return 0;
        }
    }

}
