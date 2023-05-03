
package trabalhopadaria;

public interface Pagamento {
    
    public void pagamentoDebito(double taxa);
    public void pagamentoCredito(double taxa);
    public void pagamentoPix(double taxa);
    
}
