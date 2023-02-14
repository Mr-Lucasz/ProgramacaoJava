/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author LRodrigues
 */
public class CoonjuntoComportado {
    public static void main(String[] args) {
       
        
       //SortedSet
       SortedSet<String> listaAprovados = new TreeSet<>();
       
       listaAprovados.add("Ana");
       listaAprovados.add("Julica");
       listaAprovados.add("Lucas");
       listaAprovados.add("Pedrin");
       
       for(String candidato: listaAprovados){
           System.out.println(candidato);
       }
       
         Set<Integer> nums = new HashSet<>();
         nums.add(1);
         nums.add(2);
         
         System.out.println(nums);
       
       
       
    }
}
