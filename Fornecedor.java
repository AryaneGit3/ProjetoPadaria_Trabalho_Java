
package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Fornecedor {
    
    private String nomeForn;
    private String cnpj;
    private String telefoneForn;
    private String emailForn;
   
    public Fornecedor(String cnpj){
        
        this.cnpj = cnpj;
        
    }
    
    //---------------------------------------------------------------------------
    public String getNomeForn() {
        return nomeForn;
    }

    /**
     * @param nomeForn the nomeForn to set
     */
    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the telefoneForn
     */
    public String getTelefoneForn() {
        return telefoneForn;
    }

    /**
     * @param telefoneForn the telefoneForn to set
     */
    public void setTelefoneForn(String telefoneForn) {
        this.telefoneForn = telefoneForn;
    }

    /**
     * @return the emailForn
     */
    public String getEmailForn() {
        return emailForn;
    }

    /**
     * @param emailForn the emailForn to set
     */
    public void setEmailForn(String emailForn) {
        this.emailForn = emailForn;
    }
    
    public void cadastrarFornecedor(){
        Scanner scanner = new Scanner(System.in); // scanner minusculo = entrada
        
        System.out.println("Informe o nome do fornecedor:");
        setNomeForn(scanner.next());
        
        System.out.println("Informe o CNPJ: ");
        setCnpj(scanner.next());
        
        System.out.println("Informe o telefone do fornecedor: ");
        setTelefoneForn(scanner.next());
        
        System.out.println("Informe o email principal do fornecedor:");
        setEmailForn(scanner.next());
           
    }// fim cadastra fornecedor
    
    public void mostraFornecedor(){
        
        System.out.println("*** DADOS DO FORNECEDOR ***");
        System.out.println("\nNome do fornecedor:"+getNomeForn());
        System.out.println("\nCNPJ do fornecedor:"+getCnpj());
        System.out.println("\nTelefone do fornecedor:"+getTelefoneForn());
        System.out.println("\nE-mail principal do fornecedor:"+getEmailForn());
        
    } // fim mostra fornecedor
    
  
      
} 


