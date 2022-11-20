package Produtos;

public class Arame extends Produto implements MemoriaCalculo{

    public Arame(int quantidadeItens){
        super(quantidadeItens, BitolaBarraFerroEnum.ARAME);
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.ARAME);
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
         " KG DE ARAME RECOZIDO.|";
    }

}
