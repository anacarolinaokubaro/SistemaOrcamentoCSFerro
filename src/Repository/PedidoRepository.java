package Repository;

import Resources.GravadorBancodeDados;
import Service.Orçamento;
import Service.OrçamentoService;
import Service.Pedido;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PedidoRepository {

    public static List<Pedido> listaPedido = new ArrayList<>();

    public static void cadastrarListaPedido () throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ID do orçamento que você deseja converter em Pedido? ");
        int id = scanner.nextInt();
        var filtrado = OrçamentoRepository.listaOrçamento.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
       if (filtrado != null
       ){
           System.out.println("Orçamento convertido para pedido");
           listaPedido.add((Pedido)filtrado);
           OrçamentoRepository.listaOrçamento.remove(filtrado);
           GravadorBancodeDados.writeOrçamentoList();
           GravadorBancodeDados.writePedidoList();

       } else {
           System.out.println("Não encontramos esse id, favor verificar na lista de orçamentos");
       }
    }

    public static void imprimirPedidos () throws IOException, ClassNotFoundException {
        System.out.println("____________Total de orçmentos cadastrados:_____________");
        GravadorBancodeDados.readArquivoPedido();
    }
}
