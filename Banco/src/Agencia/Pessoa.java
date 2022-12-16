package Agencia;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	
	
	public Pessoa(String nome, String cpf, String telefone) {

		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
