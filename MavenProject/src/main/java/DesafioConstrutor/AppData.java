/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafioConstrutor;

/**
 *
 * @author LRodrigues
 */
public class AppData{
    public static void main(String[] args) {
       Data d1 = new Data();
       d1.ano = 2022;
       Data d2 = new Data(31, 12, 2020);
       
    
       
       
       String dataFormatada1 = d1.ObterDataFormatada();
        System.out.println(dataFormatada1);
        System.out.println(d2.ObterDataFormatada());
        
        d1.imprimirData();
        d2.imprimirData();
              
       
       
    }
    
    
    
}
