package Repository;

import Cliente.CadastroCliente;
import Service.OrçamentoService;
import Service.Orçamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrçamentoRepository {

    public static List<Orçamento> listaOrçamento = new ArrayList<>();

    public static void cadastrarListaOrçamento(String nome) {
      var cliente = ClienteRepository.clientesCadastrados.stream().filter(item -> item.getNome().equals(nome)).findFirst();
      for (int i=0; i< ProdutoRepository.listaProdutos.ge)
      var orçamento = new Orçamento(cliente,produtos,valores);
      listaOrçamento.add(orçamento);
    }

    public static void imprimirOrçamentos (){
        System.out.println("____________Total de orçmentos cadastrados:_____________");
    listaOrçamento.stream().forEach(System.out::println);

    }



}
