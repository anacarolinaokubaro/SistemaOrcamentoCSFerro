package Service;

import Cliente.CadastroCliente;
import Produtos.Produto;

import java.util.List;
import java.util.Optional;

public class Pedido extends Orçamento {

    private static final long serialVersionUID = 1L;

    private int id;
    private static int sequence;

    public Pedido(String cliente, List<Produto> produtos, List<Double> valor, int id) {
        super(cliente, produtos, valor);
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "|ID " + id +
                "| Cliente: " + getCliente() +
                ", produtos=" + getProdutos() +
                ", valor=" + getValor() +
                '}';
    }
}
