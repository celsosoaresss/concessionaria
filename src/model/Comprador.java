package model;

public class Comprador extends User {
	
	public Comprador(String name, String cpf, String email, String type){
		super(name, cpf, email, type);
		
	}

	@Override
	public String getRole() {
		
		return "Comprador";
	}
}
