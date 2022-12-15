import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa  {
    private Boolean vip;

    private Collection<Endereco> enderecos = new ArrayList<Endereco>();

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void listarEnderecos() {
        for (Endereco e: getEnderecos()) {
            System.out.println("CEP: " + e.getCep() + ", Logradouro: " + e.getLogradouro() + ", Número: " + e.getNumero() + ", Complemento: " + e.getComplemento() +
                    ", Cidade: " + e.getCidade() + ", UF: " + e.getUf());
        }
    }

    @Override
    public boolean autenticar() {
        return true;
    }

}