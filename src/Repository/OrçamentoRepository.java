package Repository;

import Cliente.CadastroCliente;
import Produtos.Produto;
import Resources.GravadorBancodeDados;
import Service.OrçamentoService;
import Service.Orçamento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrçamentoRepository <T>{

    public static List<Orçamento> listaOrçamento = new ArrayList<>();

    public static List<Produto> listaProdutosGravada = new ArrayList<>();

    public static List<Double> listaValoresGravada = new ArrayList<>();



    public static void cadastrarListaOrçamento(String nome) throws IOException {
    Orçamento orçamento = new Orçamento(ClienteRepository.imprimirClientePorNome(nome), listaProdutosGravada, listaValoresGravada);
    listaOrçamento.add(orçamento);
    GravadorBancodeDados.writeOrçamentoList();
    }

    public static void imprimirOrçamentos () throws IOException, ClassNotFoundException {
        System.out.println("____________Total de orçmentos cadastrados:_____________");
    GravadorBancodeDados.readArquivoOrçamento();

    }



}
