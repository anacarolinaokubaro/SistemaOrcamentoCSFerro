package Service;

import Cliente.CadastroCliente;
import Produtos.Produto;

import java.util.List;
import java.util.Optional;

public class Orçamento {

    private Optional <Cliente.CadastroCliente> cliente;
    private List<Produto> produtos;
    private List<Double> valor;

    private int id;


    public Orçamento(Optional<CadastroCliente> cliente, List<Produto> produtos, List<Double> valor, int id) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valor = valor;
        this.id = id++;
    }

    public void setCliente(Optional<CadastroCliente> cliente) {
        this.cliente = cliente;
    }

    public Optional<CadastroCliente> getCliente() {
        return cliente;
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
                " |Cliente:" + cliente +
                ", produtos=" + produtos +
                ", valor=" + valor +
                '}';
    }


}
