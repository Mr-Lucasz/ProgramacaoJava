/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValorXReferencia;

/**
 *
 * @author LRodrigues
 */
public class Data {
    
    int dia, mes, ano;
    
    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }
    
     Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String ObterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirData(){
        System.out.println(ObterDataFormatada());
    }
    
    //construtor padra
}
