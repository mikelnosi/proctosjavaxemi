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
public class TablaDeMultiplicarScannerAContador {
    public static void main(String[] args) {
         tablaMultiplicar();
     }
      public static int tablaMultiplicar() {
           Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int Multiplicando = teclado.nextInt();
        teclado.close();
         int contador = 1;
        while (contador <= 10) {
            int resultado = Multiplicando * contador;
            System.out.println(Multiplicando + " x " + contador + " = " + resultado);
            contador++;
        }

         return 0;// me pide que lo ponga no se porque
          
      }
    
}
