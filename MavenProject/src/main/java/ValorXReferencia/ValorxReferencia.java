/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValorXReferencia;

/**
 *
 * @author LRodrigues
 */
public class ValorxReferencia {
    public static void main(String[] args)  {
        double a = 2;double b = a;
        a++;b--;
       
        System.out.println(a+" "+b);
        Data d1 = new Data(1, 6, 2022); Data d2 = d1;
    
        d1.dia =31;d2.mes =12;d1.ano = 2025;
        
        d1.imprimirData();d2.imprimirData();
        
        voltarValorDefault(d1);
        
        d1.imprimirData();d2.imprimirData();
        
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void alterarPrimitivo(int c){
        c++;
    }
     static void voltarValorDefault(Data d){
        d.dia =1;
        d.mes =1;
        d.ano = 1970;
    }
 
 
    }
  


