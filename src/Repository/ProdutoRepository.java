package Repository;

import Cliente.CadastroCliente;
import Principal.Principal;
import Produtos.*;
import org.w3c.dom.ls.LSOutput;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProdutoRepository <T>{


    public static List<Produto> listaProdutos = new ArrayList<>();
    public static List<Double> listTotal = new ArrayList<>();

    private static Double soma = 0.0;

    public static String clienteOrcamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        return nome;
    }

    public static void viga() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em cada viga:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: ACO_10_00;");
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem dessa viga:");
        double metragem = scanner.nextFloat();

        System.out.println("Qual a medida número 1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida número 2 do estribo: Default 0,20");
        double medida2 = scanner.nextDouble();
        if (medida2 == 0) {
            medida2 = 0.20;
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

        System.out.println("Vai ter dobra, se sim escreva SIM, informe medida: Exemplo 0,3m. Se não, escreva 0 (zero).");
        float dobra = scanner.nextFloat();


        Viga orcamento = new Viga(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
                medida1,
                medida2,
                aCada,
                dobra);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }


    public static void coluna() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em cada coluna:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: ACO_10_00;");
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem dessa coluna:");
        double metragem = scanner.nextFloat();

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

        System.out.println("O estribo é a cada quantos centimetros na coluna: Default 0,25");
        double aCada = scanner.nextDouble();
        if (aCada == 0) {
            aCada = 0.25;
        } else {
            double aCada11 = aCada;
        }

        System.out.println("Vai ter dobra, se sim escreva SIM, informe medida: Exemplo 0,3m. Se não, escreva 0 (zero).");
        float dobra = scanner.nextFloat();


        Coluna orcamento = new Coluna(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
                medida1,
                medida2,
                aCada,
                dobra);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }


    public static void sapata() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em cada sapata:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: ACO_10_00;");
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual o comprimento dessa sapata: Default 0,4 ");
        double metragem = scanner.nextFloat();
        if (metragem == 0) {
            metragem = 0.4;
        } else {
            double metragem1 = metragem;
        }

        System.out.println("Qual a altura dessa sapata: Default 0,2 ");
        double altura = scanner.nextDouble();
        if (altura == 0) {
            altura = 0.2;
        } else {
            double altura1 = altura;
        }


        System.out.println("Qual a medida da dobra da sapata: Default 0,10");
        double dobra = scanner.nextDouble();
        if (dobra == 0) {
            dobra = 0.10;
        } else {
            double dobra1 = dobra;
        }

        Sapata orcamento = new Sapata(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
                altura,
                dobra);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }


    public static void barra() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de barras para entregar:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a bitola das barras: EXEMPLO: ACO_10_00;");
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem da barra: Ex 3 m ");
        double metragem = scanner.nextFloat();

        System.out.println("Vai ter dobra, se sim escreva SIM, informe medida: Exemplo 0,3m. Se não, escreva 0 (zero).");
        float dobra = scanner.nextFloat();

        Barra orcamento = new Barra(qtdItens,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
                dobra);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }

    public static void arame() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantos Kgs de arame:");
        int qtdItens = scanner.nextInt();

        Arame orcamento = new Arame(qtdItens);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }

    public static void tela() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantas telas:");
        int qtdItens = scanner.nextInt();

        Tela orcamento = new Tela(qtdItens);
        listaProdutos.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            ProdutoRepository.imprimirOrcamento();
        }

    }




    public static void calculoOrcamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a margem a ser cosiderada nesse pedido? Exemplo: 30% ");
        Double margem = (1 + (scanner.nextDouble()/100));

        for (Produto item : listaProdutos
        ) {
            Double valorItem = ((item.valorBarraFerro() + item.valorEstribo()) * (item.valorMargem(margem)));
            listTotal.add(valorItem);
                    }

    }

    public static void valorTotalOrcamento(){
        for (Double vlrtotal : listTotal
             ) {
            soma += vlrtotal.doubleValue();
        }
    }



    public static void imprimirListaProdutoseTotal(){
        for (int i = 0; i < listaProdutos.size(); i++)
              {
                System.out.printf(listaProdutos.get(i) + "|\n R$ %.2f \n", listTotal.get(i));
            }
         }


    public static void imprimirOrcamento(){
        LocalDate hoje = LocalDate.now();
        String cliente = clienteOrcamento();
        calculoOrcamento();
        valorTotalOrcamento();

        System.out.printf("\n\n                         CS FERRO E AÇO           Fone:        (11) 96841-5179           CNPJ:        37.115.947/0001-58\n                      " + DateFormat.getDateInstance().format(new Date()) + "\n End. Loja DIADEMA: R GUARAPICICA, 123 – ELDORADO, DIADEMA, SP\nORÇAMENTO PARA:\n");
        ClienteRepository.imprimirClientePorNome(cliente);
        System.out.println("\nOs produtos cotados e seus respectivos custos são:");
        imprimirListaProdutoseTotal();
        System.out.printf("\nO Valor total do pedido é R$ %.2f ",soma);
        listTotal.clear();
        listaProdutos.clear();
    }

}
