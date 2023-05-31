/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de los arreglos:");
        n = entrada.nextInt();
        
        Metodos arreglos = new Metodos (n);
        
        arreglos.llenar(arreglos.miArreglo,1);
        arreglos.llenar(arreglos.miArreglo2,2);
        
        arreglos.presentar(arreglos.miArreglo, 1);
        arreglos.presentar(arreglos.miArreglo2, 2);
        arreglos.presentar(arreglos.calcular(), 3);
    }
}
