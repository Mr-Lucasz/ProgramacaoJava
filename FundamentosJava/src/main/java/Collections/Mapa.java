/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.Map;
import java.util.HashMap;




/**
 *
 * @author LRodrigues
 */
public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer,String> usuarios = new HashMap<>();
        
        //add e substitui
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardin");
        usuarios.put(3, "Robertinho");
        usuarios.put(2, "lucas");
        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
         System.out.println(usuarios.values());
         System.out.println(usuarios.entrySet());
    

   
    }
 
}
