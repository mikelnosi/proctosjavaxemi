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
public class sumarTresNumerosScannerA {
    public static void main(String[] args) {
        System.out.println("la suma de a b y c es  "+sumar(10, 20, 30));
    }
    //metodo sumar
   public static int sumar(int a, int b, int c){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
         a = teclado.nextInt();
        System.out.print("Introduce el 2º número: ");
         b = teclado.nextInt();
         System.out.print("Introduce el 3º número: ");
         c = teclado.nextInt();

        // Cerramos el scanner para liberar recursos
        teclado.close();

        return a+b+c;
    }
    //fin metodo sumar
    
}
