/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LRodrigues
 */
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("Teste");
        
        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        
         Set nums = new HashSet();
         nums.add(1);
         nums.add(2);
         nums.add(3);
         
         System.out.println(nums);
         System.out.println(conjunto);
         
         
         conjunto.addAll(nums);//união de conjuntos
         conjunto.retainAll(nums);
         System.out.println(conjunto);
         
         conjunto.clear();
         System.out.println(conjunto);
         
         
         
        
    }
}
