import java.util.ArrayList;
import java.util.Collection;

public class Conta {
    private String numero;

    private Cliente cliente;

    private static int contador = 1;

    private int numeroConta;
    
    public Collection<Credito> creditos = new ArrayList<Credito>();

    public Collection<Debito> debitos = new ArrayList<Debito>();

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public Conta (Cliente cliente) {
        this.setNumeroConta(contador);
        this.cliente = cliente;
        contador += 1;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addCredito(Credito credito) {
        this.creditos.add(credito);
    }

    public void addDebito(Debito debito) {
        this.debitos.add(debito);
    }

    public void depositar(Double valor) {
        Credito credito = new Credito(this);
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        Debito debito = new Debito(this);
        debito.setValor(valor);
        this.addDebito(debito);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
