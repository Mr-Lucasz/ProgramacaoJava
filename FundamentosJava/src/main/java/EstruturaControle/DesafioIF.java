/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaControle;

import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class DesafioIF {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        int num = s.nextInt();
        
        if(num == 1 )
            System.out.println("Domingo");
        
        if(num == 2 )
            System.out.println("Segunda-Feira");
        
        if(num == 3 )
            System.out.println("Terça-Feira");
        if(num == 4 )
            System.out.println("Quarta-Feira");
        if(num == 5 )
            System.out.println("Quinta-Feira");
        if(num == 6 )
            System.out.println("Sexta-Feira");
        if(num == 7 )
            System.out.println("Sábado");
        
        
        
        
    }
    
    
}
