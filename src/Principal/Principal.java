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
                    System.out.println("Opção invalida");
            }

        } while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }




    public static void orcamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_______________ORÇAMENTO________________");
        System.out.println("Escolha um dos três produtos para orçar:\n" +
                "VIGA,\n" +
                "VIGA2MM,\n" +
                "COLUNA,\n" +
                "ESTACA,\n" +
                "SAPATA,\n" +
                "BARRA,\n" +
                "ARAME,\n" +
                "ESTRIBO, \n" +
                "OU TELA. *");
        String produto = scanner.next().toUpperCase();
        ProdutosEnum.valueOf(produto);

        try {

            switch (produto) {
                case "VIGA": {
                    ProdutoRepository.viga();
                    break;
                }
                case "COLUNA": {
                    ProdutoRepository.coluna();
                    break;
                }
                case "ESTACA": {
                    ProdutoRepository.estaca();
                    break;
                }
                case "SAPATA": {
                    ProdutoRepository.sapata();
                    break;
                }
                case "BARRA": {
                    ProdutoRepository.barra();
                    break;
                }
                case "ARAME": {
                    ProdutoRepository.arame();
                    break;
                } case "TELA": {
                    ProdutoRepository.tela();
                    break;
                } case "ESTRIBO": {
                    ProdutoRepository.estribo();
                    break;
                }
                case "VIGA2MM": {
                    ProdutoRepository.viga2Bitolas();
                    break;
                } default: break;
            }

        } catch (Exception e){
            System.out.println("Opção não faz parte do Menu, vamos reiniciar");
            orcamento();
        }


    }



}
