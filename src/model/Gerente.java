package model;

public class Gerente extends User{
	
	public Gerente(String name, String cpf, String email, String type) {
		super (name, cpf, email, type);
	}
	
	@Override
	public String getRole() {
		
		return "Gerente";
	}

}
