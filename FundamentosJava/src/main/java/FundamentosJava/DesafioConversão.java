/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FundamentosJava;

import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class DesafioConversão {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o seu sálario 1:");
        String valor1 = s.next().replace(",", ".");
        
         System.out.println("Qual o seu sálario 2:");
        String valor2 = s.next().replace(",", ".");
        
         System.out.println("Qual o seu sálario 3:");
        String valor3 = s.next().replace(",", ".");
        
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        
        double media = (salario1+salario2+salario3)/3;
        
        
        System.out.print("Sua media é:" + media);
        s.close();
    
    }
    
}
