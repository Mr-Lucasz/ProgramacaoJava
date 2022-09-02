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
public class While {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        String valor = "";
            
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Vc Diz:");
            valor = s.nextLine();
            
        }
        s.close();
    }
    
}
