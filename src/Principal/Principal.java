package Principal;

import Cliente.CadastroCliente;
import Produtos.*;
import Repository.ClienteRepository;
import Repository.ProdutoRepository;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Principal {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;
        do {
            System.out.println("\n\nSelecione a opção desejada:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Ver Clientes Cadastrados");
            System.out.println("3 - Realizar orçamento");
            System.out.println("4 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    ClienteRepository.cadastrarCliente();
                    break;
                case 2:
                    ClienteRepository.imprimirListaClientes();
                    break;
                case 3:
                    orcamento();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Op??o invalida");
            }

        } while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }




    private static void orcamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________ORÇAMENTO________________");
        System.out.println("Escolha um dos três produtos para orçar:" +
                "VIGA,\n" +
                "    COLUNA,\n" +
                "    ou SAPATA;*");
        String produto = scanner.next().toUpperCase();
        ProdutosEnum.valueOf(produto);

        switch (produto) {
            case "VIGA": {
                ProdutoRepository.viga();
                break;
            }
            default:
                break;
        }
    }



}
