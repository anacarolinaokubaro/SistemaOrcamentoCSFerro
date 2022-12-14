package Resources;
import java.io.File;
import java.nio.file.Path;


public class Files {

    private static String caminhoArquivo = "src/Resources/Teste.csv";

    public static void main(String[] args) {

        Path path = Path.of(caminhoArquivo);
        File arquivos = path.toFile();





    }
}
