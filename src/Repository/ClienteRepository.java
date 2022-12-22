package Repository;

import Cliente.CadastroCliente;
import Resources.GravadorBancodeDados;
import Service.OrçamentoService;

import java.io.IOException;
import java.util.*;

public class ClienteRepository <T> {

    public static Set<CadastroCliente> clientesCadastrados = new HashSet<>();


    public static void cadastrarCliente() throws IOException {
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
        GravadorBancodeDados.writeCadastroClientesList();


        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }


    public static void imprimirListaClientes() throws IOException, ClassNotFoundException {

        System.out.println("____________Total de clientes cadastrados | LISTA:_____________");

        GravadorBancodeDados.readArquivoCliente();

    }

    public static String imprimirClientePorNome(String nome) {
        var clientesStream = clientesCadastrados.stream();
        var clienteFiltrado = clientesStream
                .filter(item -> item.getNome().equals(nome))
                .findFirst().orElse(null);
        if (Objects.isNull(clienteFiltrado)){
            return nome;
        } else {
            System.out.println(clienteFiltrado);
            return clienteFiltrado.toString();
        }
        }
    }










