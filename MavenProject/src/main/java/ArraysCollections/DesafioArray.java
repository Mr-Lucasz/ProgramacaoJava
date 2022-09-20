/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysCollections;

import java.util.Arrays;

/**
 *
 * @author LRodrigues
 */
public class DesafioArray {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.5;
       
        
        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;
                
        for(int  i = 0; i < notasAlunoA.length; i++){
        total+= notasAlunoA[i];
    }
        System.out.println(total/notasAlunoA.length);
        
    }
}
