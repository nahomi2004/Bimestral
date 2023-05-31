/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriz;

/**
 *
 * @author SALA H
 */
public class Metodos {
    public int determinantes(int[][] matriz) {
        int sum1 = 0, sum2 = 0, det, mul1, mul2, k, l;

        for (int i = 0; i < matriz.length; i++) {
            k = i;
            l = (matriz.length - 1) - i;
            mul1 = 1;
            mul2 = 1;
            for (int j = 0; j < matriz.length; j++) {
                mul1 *= matriz[j][k];
                mul2 *= matriz[j][l];
                if (k == matriz.length - 1) {
                    k = 0;
                    l = 3;
                } else {
                    k++;
                    l--;
                }
            }
            sum1 += mul1;
            sum2 += mul2;
        }
        det = sum1 - sum2;

        return det;
    }
    
    public void presentar(int[][] matriz, int d) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]*d);
            }
        }
    }
}
