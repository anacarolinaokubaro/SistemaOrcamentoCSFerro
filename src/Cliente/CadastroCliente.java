package Cliente;

import java.util.HashSet;
import java.util.Set;

public class CadastroCliente {

    private String nome;
    private String endObra;
    private String CPFouCNPJ;

    public static int ID;

    public CadastroCliente(String nome) {
        this.nome = nome;
        ID++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndObra() {
        return endObra;
    }

    public void setEndObra(String endObra) {
        this.endObra = endObra;
    }

    public String getCPFouCNPJ() {
        return CPFouCNPJ;
    }

    public void setCPFouCNPJ(String CPFouCNPJ) {
        this.CPFouCNPJ = CPFouCNPJ;
    }

    private static Set<CadastroCliente> clientesCadastrados = new HashSet<>();

    public void cadastrarClientes (CadastroCliente cliente){
        clientesCadastrados.add(cliente);
    }

    public static void imprimirListaClientes(){

        System.out.println("_____________CLIENTES CADASTRADOS:_____________");
        for (CadastroCliente cadaCliente: clientesCadastrados) {
            System.out.println(cadaCliente;
        }

    }

    @Override
    public String toString() {
        return "CadastroCliente{" +
                "nome='" + nome + '\'' +
                ", endObra='" + endObra + '\'' +
                ", CPFouCNPJ='" + CPFouCNPJ + '\'' +
                '}';
    }
}
