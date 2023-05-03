package trabalhopadaria;

import java.util.Scanner;

public class Venda{
    private Produto vender;
    private Produto Devolver;

    // Construtor: 
    public Produto getVender() {
        return vender;
    }

    public void setVender(Produto vender) {
        this.vender = vender;
    }

    public Produto getDevolver() {
        return Devolver;
    }

    public void setDevolver(Produto Devolver) {
        this.Devolver = Devolver;
    }


    public void venderProduto(Produto venda1){
        
         Scanner input = new Scanner(System.in);
         System.out.println("Digite a quantidade para vender:");
         int valor=input.nextInt();
         
         int resultado = venda1.getQtdLote() - valor;
         System.out.println("Quantidade atual do lote : "+resultado);
         
        } //  fim vender Produto 

    public void devolverProduto(Produto devolucao1){
         
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade para devolver:");
        int valor=input.nextInt();

        int resultado = devolucao1.getQtdLote()  +valor;
        System.out.println("Quantidade  atual do lote: "+resultado);
        
        } // devolver produto

   
}