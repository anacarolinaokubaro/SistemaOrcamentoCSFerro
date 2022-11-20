package Produtos;

public class Barra extends Produto implements MemoriaCalculo{

    private double dobraPonta;

    public Barra(int quantidadeItens, BitolaBarraFerroEnum mm, double metragem, double dobraPonta) {
        super(quantidadeItens, mm, metragem);
        this.dobraPonta = dobraPonta;
    }

    public double getDobraPonta() {
        return dobraPonta;
    }

    public void setDobraPonta(double dobraPonta) {
        this.dobraPonta = dobraPonta;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double percentual = ((getMetragem() + getDobraPonta()) / 12);
        double valor = ((vlr*percentual)*getQuantidadeItens());
        return valor;
    }

    @Override
    public double valorMargem(Double margem) { return margem;
    }


    @Override
    public String toString() {
        return "| " + getQuantidadeItens() + " - Qtd ITENS |" +
                " - BARRA RETA - Bitola: " + getMm() +
                "mm com " + getMetragem() +
                "m. (Dobra de " + dobraPonta +
                " m na ponta.) |";
    }
}
