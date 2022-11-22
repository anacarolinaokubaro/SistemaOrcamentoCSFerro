package Produtos;

import java.util.Scanner;

public class Sapata extends Produto implements MemoriaCalculo {

    private double altura;

    private double dobraLargura;

    public Sapata(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double altura, double dobraLargura) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem);
        this.altura = altura;
        this.dobraLargura = dobraLargura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getDobraLargura() {
        return dobraLargura;
    }

    public void setDobraLargura(double dobraLargura) {
        this.dobraLargura = dobraLargura;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double percentual = (((getMetragem() + getMetragem()) + (getAltura() + getAltura()) + getDobraLargura()) / 12);
        double valor = (((vlr * percentual) * getQuantidadeBarradeFerro()) * getQuantidadeItens());
        return valor;
    }

    @Override
    public double valorMargem(Double margem) {
        System.out.println("Informe a margem da SAPATA:");
        Scanner scanner = new Scanner(System.in);
        return margem = (1 + (scanner.nextDouble()/100));
    }


    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - SAPATAS - com " + getQuantidadeBarradeFerro() +
                        " ferros de " + getMm() +
                        "mm. Comprimento de " + getMetragem() +
                        "m. Altura de " + altura +
                "m e Largura de " + dobraLargura +
                "m. |";
    }
}
