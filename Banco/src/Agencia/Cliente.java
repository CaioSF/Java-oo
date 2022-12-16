package Agencia;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa {

	public Cliente(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		
	}
	
	 private Collection<Endereco> enderecos = new ArrayList<Endereco>();
	
	private Boolean vip;

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}
	
	public void listarEnderecos() {
		return;
	}
	
	public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

	
}
