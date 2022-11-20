package Produtos;

public class Coluna extends Viga implements MemoriaCalculo, MemoriaCalculoComEstribo {


    public Coluna(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, double medidaEstribo1, double medidaEstribo2, BitolaBarraFerroEnum mm2, double aCadaQuanto, float dobraPonta) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, medidaEstribo1, medidaEstribo2, mm2, aCadaQuanto, dobraPonta);
    }

}

