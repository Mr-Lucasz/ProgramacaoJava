/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembrosInstancia.Desafio;

import DesafioConstrutor.*;

/**
 *
 * @author LRodrigues
 */
public class Produto {
    String nome;
    double preco;
   static double desconto = 0.25;
    
    Produto(){
        
    }
    
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
      
    }
    
    double precoComDesconto(){
    return preco*(1-desconto);
    }
    
    double precoComDesconto(double descontoDoGerente){
       return preco*(1- desconto + descontoDoGerente); 
    }
}
