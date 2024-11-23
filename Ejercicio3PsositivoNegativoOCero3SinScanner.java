/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

import static com.mycompany.proyectosjavaxemi.Ejercicio3PsositivoNegativoOCero2.determinarSigno;

/**
 *
 * @author mikel1
 */
public class Ejercicio3PsositivoNegativoOCero3SinScanner {
    public static void main(String[] args) {
        int numero=0;
        determinarSigno(numero);
    }
    public static void determinarSigno(int numero) {
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número introducido es 0");
        }
    }
    }

