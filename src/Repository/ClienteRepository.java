package Repository;

import Cliente.CadastroCliente;
import Service.OrçamentoService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class ClienteRepository <T> {

    public static Set<CadastroCliente> clientesCadastrados = new HashSet<>();

    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________CADASTRO DE CLIENTE________________");
        System.out.println("Digite O NOME do Cliente:*");
        String nome = scanner.nextLine().toUpperCase();

        System.out.println("Digite o Endereço da Obra:");
        String obra = scanner.nextLine();

        System.out.println("Digite o cpf ou CNPJ:");
        String CPFouCNPJ = scanner.nextLine();

        System.out.println("Digite o contato do cliente:");
        String contato = scanner.nextLine();

        CadastroCliente cliente = new CadastroCliente(nome);
        cliente.setNome(nome);
        cliente.setEndObra(obra);
        cliente.setCPFouCNPJ(CPFouCNPJ);
        cliente.setContatoCliente(contato);
        clientesCadastrados.add(cliente);


        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }

    public static String clienteOrcamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        return nome;
    }


    public static void imprimirListaClientes() {

        System.out.println("____________Total de clientes cadastrados: "+ CadastroCliente.ID + "| LISTA:_____________");
        for (CadastroCliente cadaCliente : clientesCadastrados) {
            System.out.println(cadaCliente);
        }

    }

    public static void imprimirClientePorNome(String nome) {
        for (CadastroCliente cliente : clientesCadastrados
        ) {
            if (nome.equals(cliente.getNome())) {
                System.out.println("\n" + cliente);
              //  OrçamentoService.orcamento.add(cliente);
                break;
            }
        }
        System.out.println("\n" + nome);
    }


}





