/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import java.util.ArrayList;

/**
 *
 * @author LRodrigues
 */
public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
   
        Usuario u1= new Usuario("Ana");
        
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        System.out.println(lista.get(3));
        
        System.out.println(">>>>>"+lista.remove(1));
        System.out.println(">>>>>"+lista.remove(2));
        System.out.println(lista.remove(new Usuario("Manu")));
        
        System.out.println("Tem?" + lista.contains(new Usuario("Lia")));
        System.out.println("Tem?" + lista.contains(u1));
        
        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
        
        
        
       
        
    }
 }