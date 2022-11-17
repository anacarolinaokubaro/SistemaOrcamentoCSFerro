package Produtos;

public class Coluna extends Viga implements MemoriaCalculo{


    public Coluna(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, float metragem, double medidaEstribo1, double medidaEstribo2, double aCadaQuanto) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem, medidaEstribo1, medidaEstribo2, aCadaQuanto);
    }
}
