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

    public static void tablaMultiplicar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numElegido = teclado.nextInt();
        teclado.close();
        int variable;
        for (variable = 1; variable <= 10; variable++) {
            System.out.println(numElegido + " x " + variable + " = " + numElegido * variable);
        }
    }
} 