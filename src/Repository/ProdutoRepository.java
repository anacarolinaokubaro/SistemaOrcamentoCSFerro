package Repository;

import Produtos.BitolaBarraFerroEnum;
import Produtos.Produto;
import Produtos.Viga;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProdutoRepository {


    public static List<Produto> listaProdutos = new ArrayList<>();
    public static void viga() {
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
        String bitola = scanner.next();
        BitolaBarraFerroEnum.valueOf(bitola);

        System.out.println("Qual a metragem dessa viga:");
        float metragem = scanner.nextFloat();

        System.out.println("Vai ter dobra, se sim escreva TRUE, se não, FALSE:");
        boolean dobra = scanner.nextBoolean();

        System.out.println("Qual a medida número 1 do estribo: Default 0,09");
        double medida1 = scanner.nextDouble();
        if (medida1 == 0){
            medida1 = 0.09;
        } else {
            double medida11 = medida1;
        }

        System.out.println("Qual a medida número 2 do estribo: Default 0,15");
        double medida2 = scanner.nextDouble();
        if (medida2 == 0){
            medida2 = 0.15;
        } else {
            double medida12 = medida2;
        }

        System.out.println("O estribo é a cada quantos centimetros na viga: Default 0,25");
        double aCada = scanner.nextDouble();
        if (aCada == 0){
            aCada = 0.25;
        } else {
            double aCada11 = aCada;
        }

        Viga orcamento = new Viga(qtdItens,
                qtdBarras,
                BitolaBarraFerroEnum.valueOf(bitola),
                metragem,
                dobra,
                medida1,
                medida2,
                aCada);
        listaProdutos.add(orcamento);

        System.out.println("Deseja inserir mais uma viga?");
        String resposta = scanner.next().toUpperCase();
        if (resposta == "SIM") {
            viga();
        } else {
            double valorB = orcamento.valorBarraFerro();
            double valorE = orcamento.valorEstribo();
            System.out.println("O valor de custo MP para Viga é R$: " + (valorB+valorE));
            double valorM = orcamento.valorMargem();
            double total = (valorB + valorE) * (1 + valorM);
            System.out.println("O valor total com a margem solicitada é de: R$" + total);

            System.out.println("Mensagem para o cliente: \n\n\n");
            System.out.printf("                    CS FERRO E AÇO\n" +
                    "Fone:        (11) 96841-5179\n" +
                    "CNPJ:        37.115.947/0001-58\n" +
                    "End. Entrega e Loja DIADEMA: R GUARAPICICA, 123 – ELDORADO, DIADEMA, SÃO PAULO - CEP 09.973-240\n" +
                    "\n" +
                    "Prezado %s,\n" +
                    "\n" +
                    "A Viga :\n" + orcamento +
                    "\n" +
                    "Está no valor de R$ %f.", nome, total);
        }

    }

}
