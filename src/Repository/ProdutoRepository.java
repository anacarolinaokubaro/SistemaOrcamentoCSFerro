package Repository;

import Cliente.CadastroCliente;
import Principal.Principal;
import Produtos.*;
import Service.OrçamentoService;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProdutoRepository <T>{



    public static List<Produto> listaProdutos = new ArrayList<>();

    public static void viga() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a metragem dessa viga:");
        double metragem = scanner.nextDouble();

        System.out.println("Qual a quantidade de barras em cada viga:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola = scanner.nextDouble();

        System.out.println("Qual a medida1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida2 do estribo: Default 0,20");
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

        System.out.println("Qual a bitola do estribo: EXEMPLO: 4,2");
        double bitola2 = scanner.nextDouble();

        System.out.println("Vai ter dobra: SIM- informe a medida: Ex 0,3m. Se não - escreva 0 (zero).");
        float dobra = scanner.nextFloat();


        Viga orcamento = new Viga(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                medida1,
                medida2,
                BitolaBarraFerroEnum.getBynumero(bitola2),
                aCada,
                dobra);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }



    public static void viga2Bitolas() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a metragem dessa viga:");
        double metragem = scanner.nextDouble();

        System.out.println("Qual a PRIMEIRA quantidade de barras em cada viga:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola = scanner.nextDouble();

        System.out.println("Qual a SEGUNDA quantidade de barras em cada viga:");
        int qtdBarras2 = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola3 = scanner.nextDouble();

        System.out.println("Qual a medida1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida2 do estribo: Default 0,20");
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

        System.out.println("Qual a bitola do estribo: EXEMPLO: 4,2");
        double bitola2 = scanner.nextDouble();

        System.out.println("Vai ter dobra: SIM- informe a medida: Ex 0,3m. Se não - escreva 0 (zero).");
        float dobra = scanner.nextFloat();


        Viga2Bitolas orcamento = new Viga2Bitolas(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                medida1,
                medida2,
                BitolaBarraFerroEnum.getBynumero(bitola2),
                aCada,
                dobra,
                qtdBarras2,
                BitolaBarraFerroEnum.getBynumero(bitola3));
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }



    public static void coluna() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a metragem dessa viga:");
        double metragem = scanner.nextDouble();

        System.out.println("Qual a quantidade de barras em cada viga:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola = scanner.nextDouble();

        System.out.println("Qual a medida1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida2 do estribo: Default 0,10");
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

        System.out.println("Qual a bitola do estribo: EXEMPLO: 4,2");
        double bitola2 = scanner.nextDouble();

        System.out.println("Vai ter dobra: SIM- informe a medida: Ex 0,3m. Se não - escreva 0 (zero).");
        float dobra = scanner.nextFloat();

        Coluna orcamento = new Coluna(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                medida1,
                medida2,
                BitolaBarraFerroEnum.getBynumero(bitola2),
                aCada,
                dobra);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }


    public static void estaca() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a metragem dessa estaca:");
        double metragem = scanner.nextFloat();

        System.out.println("Qual a quantidade de barras em cada estaca:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola = scanner.nextDouble();

        System.out.println("Qual a medida do diametro: ");
        double diametro = scanner.nextDouble();

        System.out.println("O estribo é a cada quantos centimetros na viga: Default 0,25");
        double aCada = scanner.nextDouble();
        if (aCada == 0) {
            aCada = 0.25;
        } else {
            double aCada11 = aCada;
        }

        System.out.println("Qual a bitola do estribo: EXEMPLO: 4,2");
        double bitola2 = scanner.nextDouble();

        System.out.println("Vai ter dobra: SIM- informe a medida: Ex 0,3m. Se não - escreva 0 (zero).");
        float dobra = scanner.nextFloat();


        Estaca orcamento = new Estaca(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                BitolaBarraFerroEnum.getBynumero(bitola2),
                diametro,
                aCada,
                dobra);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);


        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }



    public static void estribo() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a medida1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0) {
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida2 do estribo: Default 0,20");
        double medida2 = scanner.nextDouble();
        if (medida2 == 0) {
            medida2 = 0.20;
        } else {
            double medida12 = medida2;
        }

        System.out.println("Qual a bitola do estribo: EXEMPLO: 4,2");
        double bitola2 = scanner.nextDouble();


        Estribo orcamento = new Estribo(qtdItens,
                BitolaBarraFerroEnum.getBynumero(bitola2),
                medida1,
                medida2);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }


    public static void sapata() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de itens a serem produzidos:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a quantidade de barras em cada sapata:");
        int qtdBarras = scanner.nextInt();

        System.out.println("Qual a bitola das barras principais: EXEMPLO: 10");
        double bitola = scanner.nextDouble();

        System.out.println("Qual o comprimento dessa sapata: Default 0,4 ");
        double metragem = scanner.nextDouble();
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
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                altura,
                dobra);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }


    public static void barra() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de barras para entregar:");
        int qtdItens = scanner.nextInt();

        System.out.println("Qual a bitola das barras: EXEMPLO: 10;");
        double bitola = scanner.nextDouble();


        System.out.println("Qual a metragem da barra: Ex 3 m ");
        double metragem = scanner.nextFloat();

        System.out.println("Vai ter dobra, se sim escreva SIM, informe medida: Exemplo 0,3m. Se não, escreva 0 (zero).");
        float dobra = scanner.nextFloat();

        Barra orcamento = new Barra(qtdItens,
                BitolaBarraFerroEnum.getBynumero(bitola),
                metragem,
                dobra);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }

    public static void arame() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantos Kgs de arame:");
        int qtdItens = scanner.nextInt();

        Arame orcamento = new Arame(qtdItens);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }

    public static void tela() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantas telas:");
        int qtdItens = scanner.nextInt();

        Tela orcamento = new Tela(qtdItens);
        listaProdutos.add(orcamento);
        OrçamentoRepository.listaProdutosGravada.add(orcamento);

        System.out.println("Deseja inserir mais um produto?");
        String resposta = scanner.next().toUpperCase();
        if (resposta.equals("SIM")) {
            Principal.orcamento();
        } else {
            OrçamentoService.imprimirOrcamento();
        }

    }



}
