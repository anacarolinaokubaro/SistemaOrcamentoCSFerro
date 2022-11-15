package Repository;

import Cliente.CadastroCliente;
import Produtos.BitolaBarraFerroEnum;
import Produtos.Produto;
import Produtos.Viga;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProdutoRepository {


    public static List<Produto> listaProdutos = new ArrayList<>();
    public static List<Double> listTotal = new ArrayList<>();



    public static String clienteOrcamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        return nome;
    }

    public static Void viga() {
        Scanner scanner = new Scanner(System.in);
        int id = 0;

        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em cada viga:");
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
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem dessa viga:");
        float metragem = scanner.nextFloat();

 //       System.out.println("Vai ter dobra, se sim escreva TRUE, se não, FALSE:");
 //       boolean dobra = scanner.nextBoolean();

        System.out.println("Qual a medida número 1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida número 2 do estribo: Default 0,15");
        double medida2 = scanner.nextDouble();
        if (medida2 == 0) {
            medida2 = 0.15;
        } else {
            double medida12 = medida2;
        }

        System.out.println("O estribo é a cada quantos centimetros na viga: Default 0,25");
        double aCada = scanner.nextDouble();
        if (aCada == 0) {
            aCada = 0.25;
        } else {
            double aCada11 = aCada;
        }

        Viga orcamento = new Viga(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
      //          dobra,
                medida1,
                medida2,
                aCada);
        listaProdutos.add(orcamento);
        id++;


        System.out.println("Deseja inserir mais uma viga?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            return viga();
        } else{
            return null;
        }

    }


    public static void calculoOrcamento() {
        for (Produto item : listaProdutos
        ) {
            double valorB = item.valorBarraFerro();
            double valorE = item.valorEstribo();
            double valorM = item.valorMargem();
            double total = (valorB + valorE) * (1 + valorM);
            listTotal.add(total);
                    }

    }

    public static Double valorTotalOrcamento(){
        Double soma=0.0;
        for (Double vlrtotal : listTotal
        ) {
           return soma += vlrtotal.doubleValue();
        }
        return null;
    }


    public static void imprimirListaProdutoseTotal(){
         for (Produto cadaItem : listaProdutos
             )
            for (Double cadaValor : listTotal
                 ) {
                System.out.printf(cadaItem +"|\nR$ %2f", cadaValor);
            }

        }

    public static void imprimirOrcamento(){
        LocalDate hoje = LocalDate.now();
        String cliente = clienteOrcamento();
        calculoOrcamento();
        Double soma = valorTotalOrcamento();

        System.out.printf("\n\n                         CS FERRO E AÇO\n           Fone:        (11) 96841-5179\n           CNPJ:        37.115.947/0001-58\n            " + DateFormat.getDateInstance().format(new Date()) + "\n End. Loja DIADEMA: R GUARAPICICA, 123 – ELDORADO, DIADEMA, SÃO PAULO - CEP 09.973-240\n\n ORÇAMENTO PARA:\n");
        ClienteRepository.imprimirClientePorNome(cliente);
        System.out.println("\nOs produtos cotados e seus respectivos custos são:\n");
        imprimirListaProdutoseTotal();
        System.out.printf("\n\nO Valor total do pedido é R$ %2f ",soma);
    }

}
