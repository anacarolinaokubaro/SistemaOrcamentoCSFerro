package Service;

import Cliente.CadastroCliente;
import Produtos.Produto;

import java.util.List;
import java.util.Optional;

public class Pedido extends Orçamento {


    private int id;

    public Pedido(Optional<CadastroCliente> cliente, List<Produto> produtos, List<Double> valor) {
        super(cliente, produtos, valor);
        this.id++;
    }



    @Override
    public String toString() {
        return "|ID " + id +
                " |Cliente:" + getCliente() +
                ", produtos=" + getProdutos() +
                ", valor=" + getValor() +
                '}';
    }
}
