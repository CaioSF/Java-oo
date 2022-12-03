import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa {
    private Double salario;

    private Collection<Cargo> cargos = new ArrayList<Cargo>();

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void addCargo(Cargo cargo) {
        this.cargos.add(cargo);
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário Autenticado! =)");
    }

}
