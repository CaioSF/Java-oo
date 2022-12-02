public class App {
    public static void main (String[] args) {
        Funcionario f = new Funcionario();
        Cliente c = new Cliente();

        c.setVip(Boolean.TRUE);
        f.setNome("");
        f.setCpf("");
        f.setTelefone("");
    }
}