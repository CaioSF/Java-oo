import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa  {
    private Boolean vip;

    private Collection<Endereco> enderecos = new ArrayList<Endereco>();

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário Autenticado! =)");
    }
}