package Produtos;

import java.util.Scanner;

public class Estribo extends Produto implements MemoriaCalculo{
    private double medidaEstribo1;

    private double medidaEstribo2;

    public Estribo(int quantidadeItens, BitolaBarraFerroEnum mm, double medidaEstribo1, double medidaEstribo2) {
        super(quantidadeItens, mm);
        this.medidaEstribo1 = medidaEstribo1;
        this.medidaEstribo2 = medidaEstribo2;
    }

    public double getMedidaEstribo1() {
        return medidaEstribo1;
    }

    public void setMedidaEstribo1(double medidaEstribo1) {
        this.medidaEstribo1 = medidaEstribo1;
    }

    public double getMedidaEstribo2() {
        return medidaEstribo2;
    }

    public void setMedidaEstribo2(double medidaEstribo2) {
        this.medidaEstribo2 = medidaEstribo2;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(getMm());
        double qtdEstribo = (((getMedidaEstribo1() + getMedidaEstribo1() + getMedidaEstribo2() + getMedidaEstribo2() + 0.06)/12) * getQuantidadeItens()) ;
        double valor = (vlr * qtdEstribo);
        return valor;
    }

    @Override
    public double valorMargem(Double margem) {
        System.out.println("Informe a margem do ESTRIBO:");
        Scanner scanner = new Scanner(System.in);
        return margem = (1 + (scanner.nextDouble()/100));
    }

    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - Qtd ITENS |" +
                " - ESTRIBO - " + medidaEstribo1 +
                "X" + medidaEstribo2 +
                " com bitola " + getMm() +
                "mm";
    }
}
