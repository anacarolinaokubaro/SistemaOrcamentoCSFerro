package Produtos;

public class Coluna extends Viga implements MemoriaCalculo, MemoriaCalculoComEstribo {


    public Coluna(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double medidaEstribo1, double medidaEstribo2, BitolaBarraFerroEnum mm2, double aCadaQuanto, float dobraPonta) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, medidaEstribo1, medidaEstribo2, mm2, aCadaQuanto, dobraPonta);
    }
    @Override
    public String toString() {
        return "| " + getQuantidadeItens() +
                " COLUNAS - " + getMetragem() +
                "mts C/ " + getQuantidadeBarradeFerro() +
                " ferros de " + getMm() +
                "mm.\nEstribo: " + getMedidaEstribo1() +
                " X " + getMedidaEstribo2() +
                " a cada: " + getaCadaQuanto() +
                "m (" + getMm2() +
                "mm) - dobra de " + getDobraPonta() +
                "m na ponta |";
    }


}

