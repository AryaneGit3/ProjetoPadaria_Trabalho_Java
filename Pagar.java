
package trabalhopadaria;

public class Pagar implements Pagamento {

   public Pagar(){
    
       
   }
    public void pagamentoDebito(double taxa) {
        System.out.println("o pagamento Debito adiciona uma taxa de "+taxa);
    }


    public void pagamentoCredito(double taxa) {
       System.out.println("o pagamento Debito adiciona uma taxa de "+taxa);
    }


    public void pagamentoPix(double taxa) {
         System.out.println("o pagamento Debito adiciona uma taxa de "+taxa);
    }

  
    
}
