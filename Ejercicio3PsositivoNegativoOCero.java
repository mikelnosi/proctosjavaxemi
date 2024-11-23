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
public class Ejercicio3PsositivoNegativoOCero {
     //menu principal donde se ejecuta todo el codigo
    public static void main(String[] args) {
        // Llamada al método ejecutar calcularDoble
            verificarNumero();
        // Fin de llamada al metodo ejecutar CalcularDoble
    }
    //fin menu principal donde se ejecuta todo el codigo

    // Método para calcularDoble
    public static int verificarNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
         int num1 = teclado.nextInt();
        if (num1 > 0) {
            System.out.println("El número es positivo");
        } else if(num1 < 0){
           System.out.println("El número es negativo");
        } else {
           System.out.println("El número introducido es 0");                                                     
       }

        // Cerramos el scanner para liberar recursos
        teclado.close();

       return num1;
    //fin metodo CalcularDoble
    
    }
}

//he tenido errores primero me salian las tres opciones en vez de int tenia que haber puesto void para que me salga verdadero falso