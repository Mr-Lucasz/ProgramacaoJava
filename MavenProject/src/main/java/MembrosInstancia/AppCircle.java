/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembrosInstancia;

/**
 *
 * @author LRodrigues
 */
public class AppCircle {
     public static void main(String[] args) {
        AreaCircle a1 =  new AreaCircle(10);
        //AreaCircle.pi = 10;
         System.out.println(a1.area());
        
        AreaCircle a2 =  new AreaCircle(5);
       // AreaCircle.pi = 5;
         System.out.println(a2.area());
         
         AreaCircle a3 =  new AreaCircle(2);
         System.out.println(a3.area());
     }
  
}
