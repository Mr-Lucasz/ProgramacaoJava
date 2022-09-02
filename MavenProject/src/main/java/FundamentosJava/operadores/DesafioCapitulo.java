/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FundamentosJava.operadores;

import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class DesafioCapitulo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
                
        System.out.println("Digite um número:");
        double num1 = s.nextDouble();
        
        System.out.println("Informe o operador:");
        String sinal = s.next();
         
        System.out.println("Digite outro número");
        double num2 = s.nextDouble();
        
       
        double resultado = "+".equals(sinal) ? num1 + num2 : 0;
        resultado = "-".equals(sinal) ? num1 - num2 : resultado;
        resultado = "*".equals(sinal) ? num1 * num2 : resultado;
        resultado = "/".equals(sinal) ? num1 / num2 : resultado;
        
        System.out.printf("%.2f %s  %.2f = %.2f", num1, sinal, num2, resultado);
        s.close();
        
        
    }
    
}
