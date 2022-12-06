package Produtos;

public class Estaca extends Produto implements MemoriaCalculo, MemoriaCalculoComEstribo {

    private BitolaBarraFerroEnum mm2;
    private double diametro;

    private double aCadaQuanto;
    private float dobraPonta;

    public Estaca(int quantidadeItens, int quantidadeBarradeFerro, BitolaBarraFerroEnum mm, double metragem, BitolaBarraFerroEnum mm2, double diametro, double aCadaQuanto, float dobraPonta) {
        super(quantidadeItens, quantidadeBarradeFerro, mm, metragem);
        this.mm2 = mm2;
        this.diametro = diametro;
        this.aCadaQuanto = aCadaQuanto;
        this.dobraPonta = dobraPonta;
    }

    public BitolaBarraFerroEnum getMm2() {
        return mm2;
    }

    public void setMm2(BitolaBarraFerroEnum mm2) {
        this.mm2 = mm2;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public float getDobraPonta() {
        return dobraPonta;
    }

    public void setDobraPonta(float dobraPonta) {
        this.dobraPonta = dobraPonta;
    }

    public double getaCadaQuanto() {
        return aCadaQuanto;
    }

    public void setaCadaQuanto(double aCadaQuanto) {
        this.aCadaQuanto = aCadaQuanto;
    }

    @Override
    public double valorBarraFerro() {
        double vlr = valorBitolaFerro(BitolaBarraFerroEnum.valueOf(String.valueOf(getMm())));
        double percentual = ((getMetragem()+ getDobraPonta()) / 12);
        double valor = (((vlr*percentual)*getQuantidadeBarradeFerro())*getQuantidadeItens());
        return valor;
    }

    @Override
    public double valorEstribo() {
        double vlr = valorBitolaFerro(getMm2());
        double qtdEstribo =  ( ( ( (getMetragem() / getaCadaQuanto()) * ( 6.283185 * (getDiametro()/2) ) ) * getQuantidadeItens())/12) ;
        double valor = (vlr * qtdEstribo);
        return valor;
    }

    @Override
    public double valorMargem(Double margem) { return margem;
    }

    @Override
    public double valorMaoObra() {
        double MO = getMetragem()*getQuantidadeItens();
        if (getQuantidadeBarradeFerro()>=6){
            return MO * 2;
        } else if (getQuantidadeBarradeFerro() < 6 && getQuantidadeBarradeFerro() >=4 ){
            return MO * 1.5;
        } else return MO;
    }

    @Override
    public double valorArame() {
        double vlrArame = ( (valorMaoObra()/15.0) * valorBitolaFerro(BitolaBarraFerroEnum.ARAME) );
        return vlrArame;
    }

    @Override
    public String toString() {
        return "| " + getQuantidadeItens() +
                " ESTACAS - " + getMetragem() +
                "mts C/ " + getQuantidadeBarradeFerro() +
                " ferros de " + getMm() +
                "mm.\nEstribo: " + diametro +
                "m de diâmetro a cada: " + aCadaQuanto +
                "m. de " + mm2 +
                "mm - dobra de " + dobraPonta +
                "m na ponta |";
    }
}
