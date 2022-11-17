package Produtos;

import Cliente.CadastroCliente;

public class Produto implements MemoriaCalculo {

    private int quantidadeItens;

    private int quantidadeBarradeFerro;

    private BitolaBarraFerroEnum mm;

    private float metragem;

      public Produto(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem) {
        this.quantidadeItens = quantidadeItens;
        this.quantidadeBarradeFerro = quantidadeBarradeFerro;
        this.mm = mm;
        this.metragem = metragem;
    }

    public Produto(int quantidadeItens, BitolaBarraFerroEnum mm){
          this.quantidadeItens = quantidadeItens;
          this.mm = mm;
    }

    public Produto(int quantidadeItens, BitolaBarraFerroEnum mm, float metragem) {
          this.quantidadeItens = quantidadeItens;
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


    public double valorBitolaFerro(BitolaBarraFerroEnum bitola){
        switch (bitola){
            case ACO_04_20 -> {
                return 11.00;
            }
            case ACO_05_00 -> {
                return 16.50;
            }
            case ACO_06_30 -> {
                return 22.50;
            }
            case ACO_08_00 -> {
                return 34.00;
            }
            case ACO_10_00 -> {
                return 45.50;
            }
            case ACO_12_50 -> {
                return 75.00;
            }
            case ACO_16_00 -> {
                return 130.00;
            }
            case TELA -> {
                return 100.00;
            }
            case ARAME -> {
                return 11.00;
            }
            default -> {
                return 230.00;
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
