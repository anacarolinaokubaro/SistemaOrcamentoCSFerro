package Repository;

import Cliente.CadastroCliente;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClienteRepository {

    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________CADASTRO DE CLIENTE________________");
        System.out.println("Digite O NOME do Cliente:*");
        String nome = scanner.next();

        System.out.println("Digite o Endereço da Obra:");
        String obra = scanner.next();

        System.out.println("Digite o cpf ou CNPJ:");
        String CPFouCNPJ = scanner.next();

        CadastroCliente cliente = new CadastroCliente(nome);
        cliente.setNome(nome);
        cliente.setEndObra(obra);
        cliente.setCPFouCNPJ(CPFouCNPJ);

        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }


    private static Set<CadastroCliente> clientesCadastrados = new HashSet<>();



    public void cadastrarClientes (CadastroCliente cliente){
        clientesCadastrados.add(cliente);
    }

    public static void imprimirListaClientes(){

        System.out.println("_____________CLIENTES CADASTRADOS:_____________");
        for (CadastroCliente cadaCliente: clientesCadastrados) {
            System.out.println(cadaCliente);
        }

    }

    //  @Override
    //   public int hashCode() {
    //       return this.nome;
    //   }

}
