public class Funcionario extends Pessoa {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário Autenticado! =)");
    }
}
