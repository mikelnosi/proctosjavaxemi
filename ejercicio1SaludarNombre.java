/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

/**
 *
 * @author mikel1
 */
public class ejercicio1SaludarNombre {
    //menu principal donde se ejecuta todo el codigo
    public static void main(String[] args) {
        // Llamada al método de saludar
        saludar("juan");
        // Fin de llamada saludar
    }
    //fin menu principal donde se ejecuta todo el codigo

    // Método para saludar
    public static void saludar(String nombre) {
        // "void" indica que este método no devuelve ningún valor
        System.out.println("¡Hola !"+nombre+"¡bien venido!");
    }
    //fin metodo saludar
    
}
