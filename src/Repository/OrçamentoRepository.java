package Repository;

import Cliente.CadastroCliente;
import Produtos.Produto;
import Service.OrçamentoService;
import Service.Orçamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrçamentoRepository <T>{

    public static List<Orçamento> listaOrçamento = new ArrayList<>();

    public static List<Produto> listaProdutosGravada = new ArrayList<>();

    public static List<Double> listaValoresGravada = new ArrayList<>();



    public static void cadastrarListaOrçamento(String nome) {
    Orçamento orçamento = new Orçamento(ClienteRepository.imprimirClientePorNome(nome), listaProdutosGravada, listaValoresGravada);
    listaOrçamento.add(orçamento);
    }

    public static void imprimirOrçamentos (){
        System.out.println("____________Total de orçmentos cadastrados:_____________");
    listaOrçamento.stream().forEach(System.out::println);

    }



}
