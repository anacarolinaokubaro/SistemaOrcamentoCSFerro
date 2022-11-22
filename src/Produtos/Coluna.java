package Produtos;

public class Coluna extends Viga implements MemoriaCalculo, MemoriaCalculoComEstribo {


    public Coluna(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double medidaEstribo1, double medidaEstribo2, BitolaBarraFerroEnum mm2, double aCadaQuanto, float dobraPonta) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, medidaEstribo1, medidaEstribo2, mm2, aCadaQuanto, dobraPonta);
    }
    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - COLUNAS - com " + getQuantidadeBarradeFerro() +
                " ferros de " + getMm() +
                "mm com " + getMetragem() +
                "m. Estribo: " + getMedidaEstribo1() +
                "m X " + getMedidaEstribo2() +
                "m a cada: " + getaCadaQuanto() +
                "m, com " + getMm2() +
                "mm. (dobra ponta de " + getDobraPonta() +
                "m na ponta.) |";
    }


}

