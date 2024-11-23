/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjavaxemi;

/**
 *
 * @author mikel1
 */
public class introduccionmetodos {
    public static void main(String[]args){
        saludar();
        saludar();
        System.out.println(multiplicar(10,20));
        System.out.println(division(10,20));
    }
    //Metodo saludar
    public static void saludar(){
        System.out.println("Hola, este es mi primer metodo.");
    
    }
 //metodo multiplicar
    public static int multiplicar(int a, int b){
        int multiplicar = a *b;
        return multiplicar;
    } 
//metodo division
    public static double division(double a, double b){
        double division =a/b;
        return division;
    }   
}
