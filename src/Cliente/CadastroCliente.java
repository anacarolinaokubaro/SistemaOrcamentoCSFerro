package Cliente;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CadastroCliente implements Serializable {

private static final long serialVersionUID = 1L;
        private String nome;
        private String endObra;
        private String CPFouCNPJ;

        private String contatoCliente;

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

        public String getContatoCliente() {
            return contatoCliente;
        }

        public void setContatoCliente(String contatoCliente) {
            this.contatoCliente = contatoCliente;
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }

        @Override
        public String toString() {
            return  "Cliente: " + nome +
                    "| Endereço Obra: " + endObra +
                    "| Cpf/Cnpj: " + CPFouCNPJ +
                    "| Contato: " + contatoCliente +
                    ". ";
        }

}
