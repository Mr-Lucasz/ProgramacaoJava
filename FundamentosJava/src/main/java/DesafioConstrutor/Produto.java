/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafioConstrutor;

/**
 *
 * @author LRodrigues
 */
public class Produto {
    String nome;
    double preco;
    double desconto;
    
    Produto(){
        
    }
    
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
    
    double precoComDesconto(){
    return preco*(1-desconto);
    }
    
    double precoComDesconto(double descontoDoGerente){
       return preco*(1- desconto + descontoDoGerente); 
    }
}
