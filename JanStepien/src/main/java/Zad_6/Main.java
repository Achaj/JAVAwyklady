/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Jan
 */
public class Main {
    public static void main(String[] args) {
     
        double matrixa[][]={{3,2},{5,2}};
        double matrixb[][]={{3,2},{5,2}};
        double matrixc[][] ={{0,0},{0,0}};
        
         
         for(int i=0;i<matrixa.length;i++){
             for(int j=0;j<matrixb.length;j++){
                 for(int k=0;k<matrixa.length;k++){
                      matrixc[i][j] += matrixa[i][k] * matrixb[k][j];
                 }
             }
         }
        for (double[] matrixc1 : matrixc) {
            for (int j = 0; j<matrixc.length; j++) {
                System.out.print("|" + matrixc1[j] + "|");
            }
            System.out.println("\n=============");
        }
        
    }
}
