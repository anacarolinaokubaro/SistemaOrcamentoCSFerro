package Produtos;

import Cliente.CadastroCliente;
import Produtos.BitolaBarraFerroEnum;
import Produtos.MemoriaCalculo;
import Produtos.Produto;

import java.util.Scanner;


public class Viga extends Produto implements MemoriaCalculo {

    private double medidaEstribo1;

    private double medidaEstribo2;

    private double aCadaQuanto;

    public Viga(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem, boolean dobraPonta, double medidaEstribo1, double medidaEstribo2, double aCadaQuanto) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem);
        this.medidaEstribo1 = medidaEstribo1;
        this.medidaEstribo2 = medidaEstribo2;
        this.aCadaQuanto = aCadaQuanto;
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

    public double getaCadaQuanto() {
        return aCadaQuanto;
    }

    public void setaCadaQuanto(double aCadaQuanto) {
        this.aCadaQuanto = aCadaQuanto;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double percentual = getMetragem() / 12;
        double valor = (((vlr * percentual) * getQuantidadeBarradeFerro()) * getQuantidadeItens());
        return valor;
        }

    @Override
    public double valorEstribo() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.ACO_04_20);
        double qtdEstribo = ((getMetragem() / getaCadaQuanto()) * ((getMedidaEstribo1() + getMedidaEstribo1() + getMedidaEstribo2() + getMedidaEstribo2() + 0.06)))/12;
       double valor = (vlr * qtdEstribo);
        return valor;
           }

    @Override
    public double valorMargem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a margem a ser cosiderada nesse pedido? Exemplo: 30% = 0,30");
        double margem = scanner.nextDouble();
        return margem;
        }

    @Override
    public String toString() {
        return super.toString()+ "Viga{" +
                "medidaEstribo1=" + medidaEstribo1 +
                ", medidaEstribo2=" + medidaEstribo2 +
                ", aCadaQuanto=" + aCadaQuanto +
                '}';
    }
}

