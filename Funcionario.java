package trabalhopadaria;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    
   private String dataAdmissao;
   private Double salario;
   
   public Funcionario(){
       
   }

    public Funcionario(String cpf, String nome,String endereco,
                       String dataNascimento, String telefone,String email, String dataAdmissao, Double salario){
        
            super(cpf, nome,endereco,dataNascimento, telefone, email);
        
            this.dataAdmissao = dataAdmissao;
            this.salario = salario;
        }
   //---------------------------------------------------------------------------
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //--------------------------------------------------------------------------

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
        
         System.out.println("Informe a data de admissao do funcionario (formato dd/mm/yyyy):");
         this.setDataAdmissao(scanner.next());
         
         System.out.println("Informe o salario atual do funcionario: ");
         this.setSalario(scanner.nextDouble());
         
    }

    @Override
     void mostraPessoa() {
        
    Scanner scanner = new Scanner(System.in);
         
    System.out.println(" *** DADOS DA PESSOA CADASTRADA *** ");
    System.out.println("\n CPF: "+this.getCpf());
    System.out.println("\n Nome :"+this.getNome());
    System.out.println("\n Endereco :"+this.getEndereco());
    System.out.println("\n Data de nascimento :"+this.getDataNascimento());
    System.out.println("\n Teelfone :"+this.getTelefone());
    System.out.println("\n E-mail :"+this.getEmail());
    System.out.println("\n Data de admissao: "+this.getDataAdmissao());
    System.out.println("\n Salario atual: "+this.getSalario());
    
    }
    
}
    
     