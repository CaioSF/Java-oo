package Agencia;

public class app {

	public static void main(String[] args) {
		Cargo cargo  = new Cargo();
		cargo.setNome("Gerente");
		Cargo cargo2 = new Cargo();
		cargo2.setNome("Atendente");
		
		Funcionario funcionario  = new Funcionario(null, null, null);
		funcionario.setNome("Caio");
		funcionario.setCpf("1234567891011");
		funcionario.addCargo(cargo);
		
		Funcionario funcionario2 = new Funcionario(null, null, null);
		funcionario2.setNome("Pedro");
		funcionario2.setCpf("122333299278");
		funcionario.addCargo(cargo2);
		
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getCpf());
		
		
	}

}
