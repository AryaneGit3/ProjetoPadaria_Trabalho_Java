
package trabalhopadaria;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
   
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);
         
        List<Pessoa> List = new ArrayList<>();
        
        Pessoa p1 = new Cliente("129.836.396-90","Aryane", "Rua Amora, 89 - Centro - Machado",
                                "03/09/2003", "(35)997430134", "aryane@gmail", "02/05/2023");
                        
        System.out.println("Entre com o numero estimado de pessoas a serem cadastradas no sistema: ");
        int qtdPessoa = entrada.nextInt();
        for (int i = 1; i <= qtdPessoa; i++) {

        System.out.println("\n*** PESSOAS CADASTRADAS ***\n");
        System.out.println("Cliente ou Funcionario (C/F)? ");
        String type = entrada.next().toUpperCase();
        
        System.out.println("Cpf: ");
        String cpf = entrada.next();
        System.out.println("Nome completo: ");
        String nome = entrada.next();
        System.out.println("Data de nascimento formato dia/mes/ano: ");
        String dataNascimento = entrada.next();
        System.out.println("Endereco: ");
        String endereco = entrada.next();
        System.out.println("Telefone: ");
        String telefone = entrada.next();
        System.out.println("Email: ");
        String email = entrada.next();
        
         if (type.equals("C")) {
            System.out.println("Informe a data de cadastro do cliente: ");
            String dataCadastro = entrada.next();
            Cliente c = new Cliente(cpf, nome, endereco, dataNascimento, telefone, email, dataCadastro);
            c.mostraPessoa();
            List.add(c);
         } 
            else {
              System.out.println("Informe a data de admissao do funcionario: ");
              String dataAdmissao = entrada.nextLine();
              System.out.println("Informe o valor do salario atual: ");
              Double salario = entrada.nextDouble();             
              Funcionario f = new Funcionario(cpf, nome, endereco,dataNascimento,
                                              telefone, email, dataAdmissao, salario);
              
              f.mostraPessoa();
              List.add(f);
              
         }
         
        }
         
       System.out.println();
       System.out.println("\n ----- PESSOAS CADASTRADAS NO SISTEMA -------\n");
       for (Pessoa p : List) {
           
           System.out.println(p.getCpf());
           System.out.println(p.getNome());
           System.out.println(p.getEndereco());
           System.out.println(p.getDataNascimento());
           System.out.println(p.getTelefone());
           System.out.println(p.getEmail());
           System.out.println("\n------------------------------------------------\n");

           
       }
       

        
        /*Cliente cliente1 = new Cliente();
        cliente1.cadastrarCliente();
        System.out.println("\n Cliente cadastrado com sucesso!");
        System.out.println("\n /////////////////////////////////////////// \n");
        cliente1.mostraCliente();
        System.out.println("\n Dados do Cliente exibidos com sucesso!\n");
        
       
        System.out.println("\n /////////////////////////////////////////// \n");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.cadastrarFuncionario();
        System.out.println("\n Funcionario cadastrado com sucesso!");
        System.out.println("\n /////////////////////////////////////////// \n");
        funcionario1.mostraFuncionario();
        System.out.println("\n Dados do funcionarios exibidos com sucesso!");
      
         
         System.out.println("\n /////////////////////////////////////////// \n");
         Fornecedor fornecedor1 = new Fornecedor();
         fornecedor1.cadastrarFornecedor();
         System.out.println("\nFornecedor cadastrado com sucesso!");
         System.out.println("\n////////////////////////////////////\n");
         fornecedor1.mostraFornecedor();
         System.out.println("\nDados do fornecedor exibidos com sucesso!");
         
         
         System.out.println("\n /////////////////////////////////////////// \n");
         Produto produto1 = new Produto();
         produto1.cadastrarProduto();
         System.out.println("\nProduto cadastrado com sucesso!");
         System.out.println("\n////////////////////////////////////\n");
         produto1.mostraProduto();
         System.out.println("\nDados do produto exibidos com sucesso!");
         
        //-----------------------------------------------------
         
         // enderecoini eh o vetor de endereço 
         
         System.out.println("\n////////////////////////////////////\n");
         
         Endereco enderecoini[] = new Endereco[2];
         
         
         enderecoini[0] = new Endereco("MG","Pouso Alegre","Cidade Jardim","Rua Hulonka",21);
         
         
         System.out.println("\n////////////////////////////////////\n");
         System.out.println(" *** LISTA DOS ENDEREÇOS CADASTRADOS:***\n " );
         enderecoini[0].mostrarEndereco();
        System.out.println("\n////////////////////////////////////\n");
        
         Produto produto2 = new Produto();
         produto2.setQtdLote(10);
         
         Venda venda1 = new Venda();
         venda1.venderProduto(produto1);
         
         venda1.devolverProduto(produto1);*/
    
         
    } // fim
    

        }
 
    


