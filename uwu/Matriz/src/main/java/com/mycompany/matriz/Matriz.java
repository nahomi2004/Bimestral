/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz;

/**
 *
 * @author SALA H
 */
public class Matriz {

    public static void main(String[] args) {
        System.out.println("DETERMINANTES");
        int matriz[][]  = {{1,2,0,3},
                           {1,1,2,1},
                           {2,1,3,2},
                           {2,1,2,1}};
        int matrizDet[][] = new int[4][4]; 
        
        
        Metodos md = new Metodos();      
        int determinante = md.determinantes(matriz);
        System.out.println("La determinante de la matriz es: " + determinante);
        System.out.println("La matriz multiplicada por el determinante es: ");        
        md.presentar(matriz, determinante);
                
    }
}
