package Repository;

import Service.Orçamento;
import Service.OrçamentoService;
import Service.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PedidoRepository {

    public static List<Pedido> listaPedido = new ArrayList<>();

    public static void cadastrarListaPedido (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ID do orçamento que você deseja converter em Pedido? ");
        int id = scanner.nextInt();
        var filtrado = OrçamentoRepository.listaOrçamento.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
       if (Objects.nonNull(filtrado)){
           System.out.println("Não encontramos esse id, favor verificar na lista de orçamentos");
       } else {
           System.out.println("Orçamento convertido para pedido");
           listaPedido.add((Pedido)filtrado);
           OrçamentoRepository.listaOrçamento.remove(filtrado);
       }
    }

    public static void imprimirPedidos (){
        System.out.println("____________Total de orçmentos cadastrados:_____________");
        listaPedido.stream().forEach(System.out::println);

    }
}
