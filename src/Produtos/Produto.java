package Produtos;

import Cliente.CadastroCliente;

public class Produto implements MemoriaCalculo {

    private int quantidadeItens;

    private int quantidadeBarradeFerro;

    private BitolaBarraFerroEnum mm;

    private float metragem;

    private boolean dobraPonta;

    private CadastroCliente cliente;


    public Produto(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem) {
        this.quantidadeItens = quantidadeItens;
        this.quantidadeBarradeFerro = quantidadeBarradeFerro;
        this.mm = mm;
        this.metragem = metragem;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public int getQuantidadeBarradeFerro() {
        return quantidadeBarradeFerro;
    }

    public void setQuantidadeBarradeFerro(int quantidadeBarradeFerro) {
        this.quantidadeBarradeFerro = quantidadeBarradeFerro;
    }

    public BitolaBarraFerroEnum getMm() {
        return mm;
    }

    public void setMm(BitolaBarraFerroEnum mm) {
        this.mm = mm;
    }

    public float getMetragem() {
        return metragem;
    }

    public void setMetragem(float metragem) {
        this.metragem = metragem;
    }

    public boolean isDobraPonta() {
        return dobraPonta;
    }

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public void setDobraPonta(boolean dobraPonta) {
        this.dobraPonta = dobraPonta;
    }

    public double valorBitolaFerro(BitolaBarraFerroEnum bitola){
        switch (bitola){
            case ACO_04_20 -> {
                return 11.00;
            }
            case ACO_05_00 -> {
                return 15.00;
            }
            case ACO_06_30 -> {
                return 20.00;
            }
            case ACO_08_00 -> {
                return 30.00;
            }
            case ACO_10_00 -> {
                return 45.00;
            }
            case ACO_12_50 -> {
                return 55.00;
            }
            case ACO_16_00 -> {
                return 65.00;
            }
            default -> {
                return 80.00;
            }
        }
    }


    @Override
    public double valorBarraFerro() {
        return 0;
    }

    @Override
    public double valorEstribo() {
        return 0;
    }

    @Override
    public double valorMargem(Double margem) {
        return margem;
    }

    @Override
    public String toString() {
        return " | Qtd ITENS: " + quantidadeItens +
                "| Qtd barra ferro: " + quantidadeBarradeFerro +
                " Bitola: " + mm +
                "mm com " + metragem +
                "m. ";
    }
}
