
package MembrosInstancia.Desafio;

/**
 *
 * @author LRodrigues
 */
public class AppProduto {
    public static void main(String[] args) {
        Produto.desconto = 0.10;
        Produto p1 = new Produto("Jóia", 100);
        System.out.println(p1.precoComDesconto());
            Produto p2 = new Produto("Sapato", 200);
        System.out.println(p2.precoComDesconto());
            Produto p3 = new Produto("Camisa", 1000);
        System.out.println(p3.precoComDesconto());
        Produto.desconto = 0.10;
    
        System.out.println(p1.precoComDesconto());
  
        System.out.println(p2.precoComDesconto());
     
        System.out.println(p3.precoComDesconto());
    }
}
