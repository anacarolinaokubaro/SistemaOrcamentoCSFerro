package Produtos;

public class Sapata extends Produto implements MemoriaCalculo {

    private double altura;

    private double dobraLargura;

    public Sapata(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem, double altura, double dobraLargura) {
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
        double percentual = (getMetragem() + getMetragem()) + (getAltura() + getAltura()) + getDobraLargura() / 12;
        double valor = (((vlr * percentual) * getQuantidadeBarradeFerro()) * getQuantidadeItens());
        return valor;
    }

    @Override
    public double valorEstribo() {
        double vlr = 0.0;
        return vlr;
    }

    @Override
    public double valorMargem(Double margem) {
        return margem;
    }


    @Override
    public String toString() {
        return " | Qtd ITENS: " + getQuantidadeItens() +
                        " - SAPATA - Qtd barra ferro: " + getQuantidadeBarradeFerro() +
                        " Bitola: " + getMm() +
                        "mm. Comprimento: " + getMetragem() +
                        "m. Altura: " + altura +
                "m e Largura: " + dobraLargura +
                "m. |";
    }
}
