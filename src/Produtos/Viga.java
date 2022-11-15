import Cliente.CadastroCliente;
import Produtos.BitolaBarraFerroEnum;
import Produtos.MemoriaCalculo;
import Produtos.Produto;

import java.util.Scanner;
package Produtos;

public class Viga extends Produto implements MemoriaCalculo {

    private double medidaEstribo1;

    private double medidaEstribo2;

    private double aCadaQuanto;

    public Viga(CadastroCliente cliente, int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem, boolean dobraPonta, double medidaEstribo1, double medidaEstribo2, double aCadaQuanto) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, dobraPonta, cliente);
        this.medidaEstribo1 = medidaEstribo1;
        this.medidaEstribo2 = medidaEstribo2;
        this.aCadaQuanto = aCadaQuanto;
    }

    public float getMedidaEstribo1() {
        return medidaEstribo1;
    }

    public void setMedidaEstribo1(float medidaEstribo1) {
        this.medidaEstribo1 = medidaEstribo1;
    }

    public float getMedidaEstribo2() {
        return medidaEstribo2;
    }

    public void setMedidaEstribo2(float medidaEstribo2) {
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
        double vlr = valorBarraFerro(getMm());
        double percentual = getMetragem() / 12;
        return (((vlr * percentual) * getQuantidadeBarradeFerro()) * getQuantidadeItens());
    }

    @Override
    public double valorEstribo() {
        double valor = valoresBitola(BitolaBarraFerroEnum.ACO_04_20);
        double qtdEstribo = ((getMetragem() / getaCadaQuanto()) * ((getMedidaEstribo1() + getMedidaEstribo1() + getMedidaEstribo2() + getMedidaEstribo2() + 0,
        06)))/12;
        return (valor * qtdEstribo);
    }

    @Override
    public float valorTotal() {
        System.out.println("Qual a margem?");
        Scanner input = new Scanner(System.in);
        return (valorBarraFerro() + valorEstribo()) * input;
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

