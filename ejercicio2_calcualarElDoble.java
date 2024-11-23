/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

/**
 *
 * @author mikel1
 */
public class ejercicio2_calcualarElDoble {
   //menu principal donde se ejecuta todo el codigo
    public static void main(String[] args) {
        // Llamada al método ejecutar calcularDoble
        System.out.println(calcularDoble(2));
        // Fin de llamada al metodo ejecutar CalcularDoble
    }
    //fin menu principal donde se ejecuta todo el codigo

    // Método para calcularDoble
    public static int calcularDoble(int numero) {
        // "void" indica que este método no devuelve ningún valor
        int calcularDoble =2*numero;
        return calcularDoble; 
    }
    //fin metodo CalcularDoble
    
}
