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
public class Ejercicio3PsositivoNegativoOCero2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = teclado.nextInt();
        determinarSigno(numero);
        teclado.close();
        
        }
    public static void determinarSigno(int numero){
          if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número introducido es 0");
        }
    }
}
    

