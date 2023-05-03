
package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Produto {

  
    private String codProd;
    private String nomeProd;
    private String precoCusto;
    private String precoVenda;
    private String dataValidade;
    private String lote;
    private int qtdLote;
    private Fornecedor forn1; // herda da classe Fornecedor
    
    public Produto(String codProd,String nome, String precoCusto, String precoVenda, 
                   String dataValidade, String lote, int qtdLote, Fornecedor forn1){
        
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataValidade = dataValidade;
        this.lote = lote;
        this.qtdLote = qtdLote;
        this.forn1 = forn1;  
            
    }

    //--------------------------------------------------------------------------
    
    public Fornecedor getForn1() {
        return forn1;
    }

    public void setForn1(Fornecedor forn1) {
        this.forn1 = forn1;
    }

    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    /**
     * @return the nomeProd
     */
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

 
    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getQtdLote() {
        return qtdLote;
    }

    public void setQtdLote(int qtdLote) {
        this.qtdLote = qtdLote;
    }
    
    public void cadastrarProduto(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o código do produto:");
        this.setCodProd(scanner.next());
        
        System.out.println("Informe o nome do produto:");
        this.setNomeProd(scanner.next());
        
        System.out.println("Informe o preço de custo do produto:");
        this.setPrecoCusto(scanner.next());
        
        System.out.println("Informe o preço de venda do produto:");
        this.setPrecoVenda(scanner.next());
        
        System.out.println("Informe a data de validade desse produto:");
        this.setDataValidade(scanner.next());
        
        System.out.println("Informe o lote do produto:");
        this.setLote(scanner.next());
        
        System.out.println("Informe a quantidade de produtos desse lote:");
        this.setQtdLote(scanner.nextInt());
        
    }// fim cadastrar produto
        public void mostraProduto(){
        
        System.out.println("*** DADOS DO PRODUTO ***");
        System.out.println("\nCódigo do produto:"+this.getCodProd());
        System.out.println("\nNome do produto:"+this.getNomeProd());
        System.out.println("\nPreço de custo do produto:"+this.getPrecoCusto());
        System.out.println("\nPreço de venda do produto:"+this.getPrecoVenda());
        System.out.println("\nData de validade do produto:"+this.getDataValidade());
        System.out.println("\nLote do produto:"+this.getLote());
        System.out.println("\nQuantidade de produtos do lote:"+this.getQtdLote());
        System.out.println("\nCNPJ do fornecedor :"+this.getForn1().getCnpj());
   
    } // fim mostra produto
   
      
}


