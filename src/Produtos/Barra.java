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
        double percentual = (getMetragem() / 12);
        double valor = ((vlr*percentual)*getQuantidadeItens());
        return valor;
    }

    @Override
    public double valorEstribo() {
        return 0.0;
    }

    @Override
    public double valorMargem(Double margem) { return margem;
    }

    @Override
    public String toString() {
        return " | Qtd ITENS: " + getQuantidadeItens() +
                " - BARRA RETA - Bitola: " + getMm() +
                "mm com " + getMetragem() +
                "m. (Dobra de " + dobraPonta +
                " cm na ponta.) |";
    }
}
