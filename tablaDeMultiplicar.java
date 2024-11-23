/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

/**
 *
 * @author mikel1
 */
public class tablaDeMultiplicar {
    public static void main(String[] args) {
        tablaMultiplicar();
    }

    public static void tablaMultiplicar() {
        int multiplicador;
        int Multiplicando = 12;
        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(Multiplicando + " x " + multiplicador + " = " + Multiplicando * multiplicador);
        }
    }

}
