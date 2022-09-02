/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FundamentosJava.operadores;

/**
 *
 * @author LRodrigues
 */
public class DesafioAritiméticos {
    public static void main(String[] args) {
        
        
        //parte a
        double parteA =  (6*(3+2));
        System.out.println(parteA);
        double parteAb = (3*2);
        System.out.println(parteAb);
        double parteAAb = Math.pow(parteA, 2);
        System.out.println(parteAAb);
        double parteAAAb = (parteAAb/parteAb);
        
        System.out.println("Valor 1: " + parteAAAb);
        //parte b
        double parteB =  (1-5);
        double parteBa = (2-7);
        double sub = (parteB * parteBa);
        System.out.println(sub);
        double parteBBa = sub/2;
        double parteBBBa = Math.pow(parteBBa, 2);
        System.out.println("Valor 2: " + parteBBBa);
        //parte a - b
        double parteAB = (parteAAAb - parteBBBa);
        System.out.println(parteAB);
        double parteAB2 = Math.pow(parteAB, 3);
        System.out.println("Valor 3: " + parteAB2);
        
        //divisooor
        double power = Math.pow(10, 3);
        System.out.println(power);
        double divisor = (int)(parteAB2/power);
        
        System.out.print("\n Resultado:" +(int) divisor );
        System.out.println("\n");
        
            
    }
}
