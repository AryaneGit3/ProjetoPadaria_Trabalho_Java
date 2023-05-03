
package trabalhopadaria;
import java.util.Scanner;

/**
 *
 * @author aryan
 */
public class Cliente extends Pessoa {
    
    private String dataCadastro;
    
    public Cliente(){
        
    }
    public Cliente(String cpf, String nome, String endereco, String dataNascimento,
                   String telefone, String email, String dataCadastro) {
        
        super(cpf,nome,endereco,dataNascimento,telefone,email);
        
        this.dataCadastro = dataCadastro;
    }
    
    //---------------------------------------------------------------------------
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    //------------------------------------------------------------------------------    

    @Override
    public void cadastrarPessoa() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o CPF: ");
        this.setCpf(scanner.next());
       
        System.out.println("Informe o nome: ");
        this.setNome(scanner.next());

        System.out.println("Informe o endereco :");
        this.setEndereco(scanner.next());
        
        System.out.println("Informe a data de nascimento no formato (dd/mm/yyyy): ");
        this.setDataNascimento(scanner.next());
        
        System.out.println("Informe o telefone :");
        this.setTelefone(scanner.next());

        System.out.println("Informe o e-mail: ");
        this.setEmail(scanner.next());
        
        System.out.println("Informe a data de cadastro do cliente: ");
        this.setDataCadastro(scanner.next());
         
    }

    @Override
    void mostraPessoa() {
        
    Scanner scanner = new Scanner(System.in);
        
    System.out.println(" *** DADOS DA PESSOA CADASTRADA *** ");
    System.out.println("\n CPF: "+this.getCpf());
    System.out.println("\n Nome :"+this.getNome());
    System.out.println("\n Endereco :"+this.getEndereco());
    System.out.println("\n Data de nascimento :"+this.getDataNascimento());
    System.out.println("\n Telefone :"+this.getTelefone());
    System.out.println("\n E-mail :"+this.getEmail());
    System.out.println("\n Data de admissao: "+this.getDataCadastro());
    
    }
    
   
}
