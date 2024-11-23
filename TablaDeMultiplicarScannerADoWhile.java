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
public class TablaDeMultiplicarScannerADoWhile {
      public static void main(String[] args) {
         tablaMultiplicar();
     }
      public static int tablaMultiplicar() {
           Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int Multiplicando = teclado.nextInt();
        teclado.close();
         int multiplicador = 1;
            do {System.out.println (Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
                   multiplicador += 1;
        } while (multiplicador<=10);     
          return 0;
    }    
      }
    

