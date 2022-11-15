import Cliente.CadastroCliente;
import Produtos.BitolaBarraFerroEnum;
import Produtos.Produto;
import Produtos.ProdutosEnum;
import com.sun.jdi.Value;

import java.util.Scanner;
package Principal;



public class Principal {

    public static void main(String[] args) {


        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;
        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Ver Clientes Cadastrados");
            System.out.println("3 - Realizar orçamento");
            System.out.println("4 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    cadastrarCliente(scanner, CadastroCliente);
                    break;
                case 2:
                    CadastroCliente.imprimirListaClientes();
                    break;
                case 3:
                    cachorroRepository.limpaCadastro();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Op??o invalida");
            }

        } while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }


    private static void cadastrarCliente(Scanner scanner, CadastroCliente cliente) {
        System.out.println("_______________CADASTRO DE CLIENTE________________");
        System.out.println("Digite O NOME do Cliente:*");
        String nome = scanner.next();

        System.out.println("Digite o Endereço da Obra:");
        String obra = scanner.next();

        System.out.println("Digite o cpf ou CNPJ:");
        String CPFouCNPJ = scanner.next();

        CadastroCliente cliente = new CadastroCliente();
        cliente.setNome(nome);
        cliente.setEndObra(obra);
        cliente.setCPFouCNPJ(CPFouCNPJ);

        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }

    private static void orcamento(Scanner scanner, Produto) {
        System.out.println("_______________ORÇAMENTO________________");
        System.out.println("Escolha um dos três produtos para orçar:" +
                "VIGA,\n" +
                "    COLUNA,\n" +
                "    ou SAPATA;*");
        String produto = scanner.next().toUpperCase();
        ProdutosEnum.valueOf(produto);

        switch (produto) {
            case "VIGA" {

            }
        }
    }


    public static void viga () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();

        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em usada em cada viga:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola dessas barras:" +
                "ACO_04_20,\n" +
                "    ACO_05_00,\n" +
                "    ACO_06_30,\n" +
                "    ACO_08_00,\n" +
                "    ACO_10_00,\n" +
                "    ACO_12_50,\n" +
                "    ACO_16_00,\n" +
                "    ACO_20_00;");
        String bitola = scanner.nextInt();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem dessa viga:");
        float metragem = scanner.nextFloat();

        System.out.println("Vai ter dobra, se sim escreva TRUE, se não, FALSE:");
        boolean dobra = scanner.next();

        System.out.println("Qual a medida número 1 do estribo: Exemplo 0.09");
        double medida1 = scanner.nextDouble();

        System.out.println("Qual a medida número 2 do estribo:");
        double medida2 = scanner.nextDouble();

        System.out.println("O estribo é a cada quantos centimetros na viga: Exemplo 0.25");
        double aCada = scanner.nextDouble();

        Viga orcamentoViga = new Viga();
        orcamentoViga.setCliente(nome);

        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }

}
