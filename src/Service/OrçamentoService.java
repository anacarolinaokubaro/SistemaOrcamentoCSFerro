package Service;

import Produtos.*;
import Repository.ClienteRepository;
import Repository.Or├žamentoRepository;
import Repository.ProdutoRepository;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Or├žamentoService <T> {

    public static List<Double> listTotal = new ArrayList<>();


    public static void calculoOrcamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a margem a ser cosiderada nesse pedido? Exemplo: 30% ");
        double margem = (1 + (scanner.nextDouble()/100));

        for (Produto item : ProdutoRepository.listaProdutos
        ) {
            double valorItem = 0.0;
            if (item instanceof Viga) {
                Viga item2 = (Viga)item;
                valorItem = ((item2.valorBarraFerro()
                        + item2.valorEstribo()
                        + item2.valorMaoObra()
                        + item2.valorArame()) * item2.valorMargem(margem));
            } else if (item instanceof Viga2Bitolas) {
                Viga2Bitolas item2 = (Viga2Bitolas) item;
                valorItem = ((item2.valorBarraFerro()
                        + item2.valorEstribo()
                        + item2.valorMaoObra()
                        + item2.valorArame()) * item2.valorMargem(margem));
            } else if (item instanceof Coluna) {
                Coluna item2 = (Coluna) item;
                valorItem = ((item2.valorBarraFerro()
                        + item2.valorEstribo()
                        + item2.valorMaoObra()
                        + item2.valorArame()) * item2.valorMargem(margem));
            } else if (item instanceof Sapata) {
                Sapata item2 = (Sapata) item;
                valorItem = (item2.valorBarraFerro()* item2.valorMargem(margem));
            } else if (item instanceof Barra) {
                Barra item2 = (Barra) item;
                valorItem = (item2.valorBarraFerro() * item2.valorMargem(margem));
            } else if (item instanceof Arame) {
                Arame item2 = (Arame) item;
                valorItem = (item2.valorBarraFerro() * item2.valorMargem(margem));
            } else if (item instanceof Tela) {
                Tela item2 = (Tela) item;
                valorItem = (item2.valorBarraFerro() * item2.valorMargem(margem));
            } else if (item instanceof Estaca) {
                Estaca item2 = (Estaca) item;
                valorItem = ((item2.valorBarraFerro()
                        + item2.valorEstribo()
                        + item2.valorMaoObra()
                        + item2.valorArame()) * item2.valorMargem(margem));
            } else if (item instanceof Estribo) {
                Estribo item2 = (Estribo) item;
                valorItem = ((item2.valorBarraFerro() * item2.valorMargem(margem)));
            } else System.out.println("Escolha um produto da lista.");
            listTotal.add(valorItem);
            Or├žamentoRepository.listaValoresGravada.add(valorItem);
        }
    }



    public static void imprimirListaProdutoseTotal(){
        for (int i = 0; i < ProdutoRepository.listaProdutos.size(); i++)
        {
            System.out.printf(ProdutoRepository.listaProdutos.get(i) + "|\n R$ %.2f \n", listTotal.get(i));
        }
    }


    public static void imprimirOrcamento() throws IOException {
        LocalDate hoje = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        calculoOrcamento();

        System.out.printf("\n\n   CS FERRO E A├çO           Fone:        (11) 96841-5179           CNPJ:        37.115.947/0001-58\n\n " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + "\n\nOR├çAMENTO PARA:");
        Or├žamentoRepository.cadastrarListaOr├žamento(nome);
        System.out.println("\n\nOs produtos cotados e seus respectivos custos s├úo:");
        imprimirListaProdutoseTotal();
        System.out.printf("\nVALOR TOTAL : R$ %.2f ",listTotal.stream().mapToDouble(item -> item.doubleValue()).sum());
        System.out.println("\nCondi├ž├úo de pagamento ├á vista at├ę o dia "+ LocalDate.now().plusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));

        listTotal.clear();
        ProdutoRepository.listaProdutos.clear();
    }



}
