package Resources;

import Cliente.CadastroCliente;
import Repository.ClienteRepository;

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
        var list = new ArrayList();
        try (var in = new FileInputStream(Path.of(caminhoDoArquivoCadastroCliente).toFile())) {
            while (true) {
                ObjectInputStream os = new ObjectInputStream(in);
                var objeto = os.readObject();
                list.add(objeto);
            }
        } catch (EOFException e) {
            System.out.printf("");
        }
        return list;
    }



    }

