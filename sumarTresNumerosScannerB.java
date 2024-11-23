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
public class sumarTresNumerosScannerB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero1 = teclado.nextInt();
         System.out.print("Introduce un número: ");
        int numero2 = teclado.nextInt();
         System.out.print("Introduce un número: ");
        int numero3 = teclado.nextInt();
        suma(numero1, numero2, numero3);
        teclado.close();
    }
    public static int suma(int numero1, int numero2, int numero3) {
      int suma = numero1+numero2+numero3;
        System.out.println(suma);
        return 0;//la aplicacion me dice que ponga esto no se porque
    }
}
