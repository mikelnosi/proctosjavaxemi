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
public class TablaDeMultiplicarScannerA {
    public static void main(String[] args) {
         tablaMultiplicar();
     }
      public static int tablaMultiplicar() {
           Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int Multiplicando = teclado.nextInt();
        teclado.close();
          int multiplicador;
for(multiplicador = 1; multiplicador <=10; multiplicador++){
    System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
}
         return 0;// me pide que lo ponga no se porque
          
      }
    
}
