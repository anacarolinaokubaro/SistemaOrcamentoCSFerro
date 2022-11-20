package Produtos;

public enum BitolaBarraFerroEnum {

    ACO_04_20 (4.2, "ACO_04_20"),
    ACO_05_00 (5 , "ACO_05_00"),
    ACO_06_30 (6.3, "ACO_06_30"),
    ACO_08_00 (8, "ACO_08_00"),
    ACO_10_00 (10, "ACO_10_00"),
    ACO_12_50 (12.5, "ACO_12_50"),
    ACO_16_00 (16, "ACO_16_00"),

    ACO_20_00 (20, "ACO_20_00"),

    ARAME (1, "ARAME"),

    TELA (1,"TELA");

    private double bitola;

    private String descricao;

    private BitolaBarraFerroEnum(double bitola, String descricao){
        this.bitola = bitola;
        this.descricao = descricao;
    }
    public double getBitola() {
        return bitola;
    }
    public static BitolaBarraFerroEnum getBynumero (double bitola){
        for (BitolaBarraFerroEnum b: BitolaBarraFerroEnum.values()){
            if (b.getBitola() == bitola){
                return b;
            }
        }
        return ACO_10_00;
    }

    public void setBitola(double bitola) {
        this.bitola = bitola;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
