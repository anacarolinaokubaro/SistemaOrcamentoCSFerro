package Resources;

import Cliente.CadastroCliente;
import Repository.ClienteRepository;
import Repository.OrçamentoRepository;
import Repository.PedidoRepository;
import Service.Orçamento;
import Service.Pedido;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GravadorBancodeDados {


    private static String caminhoDoArquivoCadastroCliente = "C:/Users/55119/IdeaProjects/SistemaOrcamentoCSFerro/src/Resources/CadastroClientes.csv";

    private static String caminhoDoArquivoOrçamento = "C:/Users/55119/IdeaProjects/SistemaOrcamentoCSFerro/src/Resources/Orçamento.csv";

    private static String caminhoDoArquivoPedido = "C:/Users/55119/IdeaProjects/SistemaOrcamentoCSFerro/src/Resources/Pedido.csv";

    public static void writeCadastroClientesList() throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(Path.of(caminhoDoArquivoCadastroCliente).toFile());
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (CadastroCliente cliente: ClienteRepository.clientesCadastrados
                 ) {
                oos.writeObject(cliente);
            }
            oos.flush();
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public static List readArquivoCliente() throws IOException, ClassNotFoundException {
        var list = new ArrayList<CadastroCliente>();
        try
            (var in = new ObjectInputStream( new BufferedInputStream( new FileInputStream(Path.of(caminhoDoArquivoCadastroCliente).toFile())))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof CadastroCliente c)
                    list.add(c);
            }
        } catch (EOFException e) {
        }
        list.stream().toList().forEach(System.out::println);
        return list;
    }


    public static void writeOrçamentoList() throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(Path.of(caminhoDoArquivoOrçamento).toFile());
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Orçamento orçamento: OrçamentoRepository.listaOrçamento
            ) {
                oos.writeObject(orçamento);
            }
            oos.flush();
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public static List readArquivoOrçamento() throws IOException, ClassNotFoundException {
        var list = new ArrayList<Orçamento>();
        try
                (var in = new ObjectInputStream( new BufferedInputStream( new FileInputStream(Path.of(caminhoDoArquivoOrçamento).toFile())))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Orçamento o)
                    list.add(o);
            }
        } catch (EOFException e) {
        }
        list.stream().toList().forEach(System.out::println);
        return list;
    }


    public static void writePedidoList() throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(Path.of(caminhoDoArquivoPedido).toFile());
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Pedido pedido: PedidoRepository.listaPedido
            ) {
                oos.writeObject(pedido);
            }
            oos.flush();
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public static List readArquivoPedido() throws IOException, ClassNotFoundException {
        var list = new ArrayList<Pedido>();
        try
                (var in = new ObjectInputStream( new BufferedInputStream( new FileInputStream(Path.of(caminhoDoArquivoPedido).toFile())))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Pedido p)
                    list.add(p);
            }
        } catch (EOFException e) {
        }
        list.stream().toList().forEach(System.out::println);
        return list;
    }

}

