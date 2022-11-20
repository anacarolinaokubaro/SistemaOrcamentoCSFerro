package Produtos;

public class Tela extends Produto implements MemoriaCalculo{

    public Tela(int quantidadeItens){
        super(quantidadeItens, BitolaBarraFerroEnum.TELA);
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.TELA);
        double valor = vlr * getQuantidadeItens();
        return valor;
    }

    @Override
    public double valorMargem(Double margem) {
        return margem;
    }


    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - Qtd ITENS |" +
                " - TELA MALHA POP. |";
    }
}
