package Agencia;



public class app2 {

	
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco();
		endereco1.setCep("555555555");
		endereco1.setCidade("Juiz de Fora");
		endereco1.setComplemento("apto");
		endereco1.setUf("MG");
		endereco1.setLogradouro("Rua teste");
		endereco1.setNumero("548");
		
		
		Cliente cliente1 = new Cliente(null, null, null);
		cliente1.setNome("Caio");
		cliente1.setCpf("12345678901");
		cliente1.setTelefone("32325363");
		cliente1.addEndereco(endereco1);
		
		
		Endereco endereco2 = new Endereco();
		endereco2.setCep("555555555");
		endereco2.setCidade("Santos");
		endereco2.setComplemento(null);
		endereco2.setUf("SP");
		endereco2.setLogradouro("Rua teste2");
		endereco2.setNumero("423");
		
		new Endereco();
		endereco2.setCep("444444444");
		endereco2.setCidade("Cabo Frio");
		endereco2.setComplemento(null);
		endereco2.setUf("RJ");
		endereco2.setLogradouro("Rua teste3");
		endereco2.setNumero("111");
		
		
		System.out.println( cliente1.getNome());
		System.out.println( cliente1.getCpf());
		System.out.println( cliente1.getTelefone());
		
		

	}

}
