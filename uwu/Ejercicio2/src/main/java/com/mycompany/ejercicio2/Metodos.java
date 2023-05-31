/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {
    Scanner entrada;
    int [] miArreglo;
    int [] miArreglo2;
    int [] miArreglo3;
    
    public Metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.miArreglo = new int [_lim];
        this.miArreglo2 = new int [_lim];
        this.miArreglo3 = new int [_lim+_lim];
    } 
    
    public void llenar(int []x, int n) {
        System.out.println("Arreglo numero "+n);
        for (int i=0;i<x.length;i++) {
            System.out.print("Ingrese un número en la posición ["+(i+1)+"]: ");
            x[i]=entrada.nextInt();
        }
    }
    
    public void presentar(int []x, int n) {
        System.out.println("");
        System.out.println("Arreglo numero "+n);
        for (int i=0;i<x.length;i++) {
            if (x[i]==0) {
                break;
            }
            System.out.print("["+(i+1)+"]: "+x[i]);
        }
    }
    
    public int secuencial(int x) {
        for (int i=0;i<miArreglo2.length;i++) {
            if (x==miArreglo2[i]) {
                return -1;
            }
        }
        return 1;
    }
    
    public int[] calcular() {
        int j=0;
        for (int i=0;i<miArreglo.length;i++) { 
            int c = miArreglo[i];
            if (secuencial(c)!=-1) {
                miArreglo3[j] = miArreglo[i];
                j++;
            }            
        }
        
        for (int i=0;i<miArreglo2.length;i++) { 
            int c = miArreglo2[i];
            if (secuencial(c)!=-1) {
                miArreglo3[j+1] = miArreglo2[i];
                j++;
            }
            
        }
        return miArreglo3;
    }
}
