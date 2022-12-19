package Service;

import Produtos.Produto;

import java.io.Serializable;
import java.util.List;

public class Orçamento implements Serializable {

    private static final long serialVersionUID = 1L;


    private String cliente;
    private List <Produto> produtos;
    private List <Double> valor;

    private int id;

    public static int sequence;


    public Orçamento(String cliente, List <Produto> produtos,List <Double> valor) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valor = valor;
        this.id = sequence++;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Double> getValor() {
        return valor;
    }

    public void setValor(List<Double> valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "|ID " + id +
                "| Cliente: " + cliente +
                ", produtos=" + produtos +
                ", valor=" + valor +
                '}';
    }


}
