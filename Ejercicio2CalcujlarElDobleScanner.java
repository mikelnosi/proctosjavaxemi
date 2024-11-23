/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

import java.util.Scanner;

/**
 *
 * @author mikel1
 */
public class Ejercicio2CalcujlarElDobleScanner {
    //menu principal donde se ejecuta todo el codigo
    public static void main(String[] args) {
        // Llamada al método ejecutar calcularDoble
        int resultado = calcularDoble();
        System.out.println("el doble es"+resultado);
        // Fin de llamada al metodo ejecutar CalcularDoble
    }
    //fin menu principal donde se ejecuta todo el codigo

    // Método para calcularDoble
    public static  int calcularDoble() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        // Cerramos el scanner para liberar recursos
        teclado.close();
  // Calculamos el doble y lo devolvemos
        return 2* num1;
    }
    //fin metodo CalcularDoble  
}
