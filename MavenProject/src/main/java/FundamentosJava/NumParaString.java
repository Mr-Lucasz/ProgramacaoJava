/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FundamentosJava;

import javax.swing.JOptionPane;

/**
 *
 * @author LRodrigues
 */
public class NumParaString {
    public static void main(String[] args) {
       Integer num1 =  10000;
        System.out.println(num1.toString().length());
        
        int num2 = 100002;
        System.out.println(Integer.toString(num2).length());
        
        
        //String para Num
        
        String valor1 =  JOptionPane.showInputDialog
        ("Digite o primeiro numero:");
        String valor2 =  JOptionPane.showInputDialog
        ("Digite o segundo numero:");
        
        
        System.out.println(valor1 + valor2);
        
        double numero1 = Double.parseDouble(valor1);
        
    }
}
