package Produtos;

import Cliente.CadastroCliente;

public class Produto {

    private int quantidadeItens;

    private int quantidadeBarradeFerro;

    private BitolaBarraFerroEnum mm;

    private float metragem;

    private boolean dobraPonta;

    private CadastroCliente cliente;

    public Produto(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem, boolean dobraPonta, CadastroCliente cliente) {
        this.quantidadeItens = quantidadeItens;
        this.quantidadeBarradeFerro = quantidadeBarradeFerro;
        this.mm = mm;
        this.metragem = metragem;
        this.dobraPonta = dobraPonta;
        this.cliente = cliente;
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

    public void setDobraPonta(boolean dobraPonta) {
        this.dobraPonta = dobraPonta;
    }

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public double valoresBitola(BitolaBarraFerroEnum mm) {
        switch (mm) {
            case ACO_04_20 -> {
                return 60.00;
            }
            case ACO_05_00 -> {
                return 65.00;
            }
            case ACO_06_30 -> {
                return 70.00;
            }
            case ACO_08_00 -> {
                return 75.00;
            }
            case ACO_10_00 -> {
                return 80.00;
            }
            case ACO_12_50 -> {
                return 90.00;
            }
            case ACO_16_00 -> {
                return 95.00;
            }
            default -> {
                return 100.00;
            }

        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cliente=" + cliente +
                "quantidadeItens=" + quantidadeItens +
                ", quantidadeBarradeFerro=" + quantidadeBarradeFerro +
                ", mm=" + mm +
                ", metragem=" + metragem +
                ", dobraPonta=" + dobraPonta +
                                '}';
    }
}
