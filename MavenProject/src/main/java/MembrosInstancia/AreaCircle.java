/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembrosInstancia;

/**
 *
 * @author LRodrigues
 */
public class AreaCircle {
        static final double PI = Math.PI;
        float raio;

     AreaCircle(float raioInicial) {
        this.raio = raioInicial;
     
    }
    double area(){
        return raio*raio*(PI);
    }
    
 
}
