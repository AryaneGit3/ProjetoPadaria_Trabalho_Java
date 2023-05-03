
package trabalhopadaria;

import java.util.Scanner;

    abstract public class Pessoa { // EH UMA SUPERCLASSE
    
    private String cpf;
    private String nome;
    private String endereco;
    private String dataNascimento;
    private String telefone;
    private String email;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String cpf, String nome,String endereco, 
                  String dataNascimento, String telefone, String email){
        
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        
    }
    
    //--------------------------------------------------------------------------
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
        
    }
    
        abstract public void cadastrarPessoa();
        
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o CPF: ");
        setCpf(scanner.next());
       
        System.out.println("Informe o nome: ");
        setNome(scanner.next());

        System.out.println("Informe o endereco :");
        setEndereco(scanner.next());
        
        System.out.println("Informe a data de nascimento no formato (dd/mm/yyyy): ");
        setDataNascimento(scanner.next());
        
        System.out.println("Informe o telefone :");
        setTelefone(scanner.next());

        System.out.println("Informe o e-mail: ");
        setEmail(scanner.next());*/
           
 // fim cadastra pessoa
    
        abstract void mostraPessoa();
        
    /*System.out.println(" *** DADOS DA PESSOA CADASTRADA *** ");
    System.out.println("\n CPF: "+getCpf());
    System.out.println("\n Nome :"+getNome());
    System.out.println("\n Endereco :"+getEndereco());
    System.out.println("\n Data de nascimento :"+getDataNascimento());
    System.out.println("\n Teelfone :"+getTelefone());
    System.out.println("\n E-mail :"+getEmail());
    } // fim mostra pessoa cadastrada*/
            
} // fim da superclass 

