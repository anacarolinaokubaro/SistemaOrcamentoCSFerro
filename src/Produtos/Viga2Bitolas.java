package Produtos;

public class Viga2Bitolas extends Viga implements MemoriaCalculo, MemoriaCalculoComEstribo{
    private int  quantidadeBarradeFerro2;

    private BitolaBarraFerroEnum mm3;

    public Viga2Bitolas(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double medidaEstribo1, double medidaEstribo2, BitolaBarraFerroEnum mm2, double aCadaQuanto, float dobraPonta, int quantidadeBarradeFerro2, BitolaBarraFerroEnum mm3) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, medidaEstribo1, medidaEstribo2, mm2, aCadaQuanto, dobraPonta);
        this.quantidadeBarradeFerro2 = quantidadeBarradeFerro2;
        this.mm3 = mm3;
    }

    public int getQuantidadeBarradeFerro2() {
        return quantidadeBarradeFerro2;
    }

    public void setQuantidadeBarradeFerro2(int quantidadeBarradeFerro2) {
        this.quantidadeBarradeFerro2 = quantidadeBarradeFerro2;
    }

    public BitolaBarraFerroEnum getMm3() {
        return mm3;
    }

    public void setMm2(BitolaBarraFerroEnum mm3) {
        this.mm3 = mm3;
    }


    @Override
    public double valorBarraFerro() {
        double vlr1 = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double vlr2 = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(mm3)));
        double percentual = ((getMetragem()+ getDobraPonta()) / 12);
        double valor = ((((vlr1*percentual)*getQuantidadeBarradeFerro())*getQuantidadeItens()) + (((vlr2*percentual)*getQuantidadeBarradeFerro2())*getQuantidadeItens()));
        return valor;
    }

    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - Qtd ITENS |" +
                " - VIGA/COLUNA - Qtd barra ferro1: " + getQuantidadeBarradeFerro() +
                " Bitola: " + getMm() +
                " + Qtd barra ferro2: " + quantidadeBarradeFerro2 +
                " Bitola: " + mm3 +
                "mm com " + getMetragem() +
                "m. Estribo: " + getMedidaEstribo1() +
                "X" + getMedidaEstribo2() +
                " a cada: " + getaCadaQuanto() +
                "m. com bitola " + getMm2() +
                "(dobra ponta de " + getDobraPonta() +
                "m na ponta.) |";
    }
}
