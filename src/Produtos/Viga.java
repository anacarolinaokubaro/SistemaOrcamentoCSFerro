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

    private float dobraPonta;

    public Viga(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double medidaEstribo1, double medidaEstribo2, double aCadaQuanto, float dobraPonta) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem);
        this.medidaEstribo1 = medidaEstribo1;
        this.medidaEstribo2 = medidaEstribo2;
        this.aCadaQuanto = aCadaQuanto;
        this.dobraPonta = dobraPonta;
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

    public float getDobraPonta() {
        return dobraPonta;
    }

    public void setDobraPonta(float dobraPonta) {
        this.dobraPonta = dobraPonta;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double percentual = ((getMetragem()+ getDobraPonta()) / 12);
        double valor = (((vlr*percentual)*getQuantidadeBarradeFerro())*getQuantidadeItens());
        return valor;
        }

    @Override
    public double valorEstribo() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.ACO_04_20);
        double MO = getMetragem()*getQuantidadeItens();
        double vlrArame = (MO/15.0)*valorBitolaFerro(BitolaBarraFerroEnum.ARAME);
        double qtdEstribo = (((getMetragem() / getaCadaQuanto()) * ((getMedidaEstribo1() + getMedidaEstribo1() + getMedidaEstribo2() + getMedidaEstribo2() + 0.06)/12)) * getQuantidadeItens()) ;
       double valor = ((vlr * qtdEstribo) + (MO  + vlrArame));
        return valor;
           }

    @Override
    public double valorMargem(Double margem) { return margem;
        }

    @Override
    public String toString() {
        return " | Qtd ITENS: " + getQuantidadeItens() +
                " - VIGA/COLUNA - Qtd barra ferro: " + getQuantidadeBarradeFerro() +
                " Bitola: " + getMm() +
                "mm com " + getMetragem() +
                "m. Estribo: " + medidaEstribo1 +
                "X" + medidaEstribo2 +
                " a cada: " + aCadaQuanto +
                "m. (dobra ponta de " + dobraPonta +
                "m.) |";
    }
}

