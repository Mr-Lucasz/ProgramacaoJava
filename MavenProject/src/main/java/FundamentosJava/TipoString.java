/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FundamentosJava;

/**
 *
 * @author LRodrigues
 */
public class TipoString {
   
    public static void main(String[] args) {
        
        System.out.println("Olá Mundo".charAt(2));
        //.concat
        // to.uppercase
        String s = "Boa tarde";
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.endsWith("dia!"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        
        var nome = "Lucas";
        var sobrenome = "Rodrigues";
        var idade = 21;
        var salario = 1234.4210;
        
        System.out.printf("Nome: %s %s tem %d e ganhar por mes R$%.1f", nome, sobrenome, idade, salario);
        
        // mesmo exemplo acima usando o string format String frase = String.format("Nome: %s %s tem %d 
        //e ganhar por mes R$%.1f", nome, sobrenome, idade, salario);
    }
}
