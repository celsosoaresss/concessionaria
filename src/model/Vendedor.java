package model;

public class Vendedor extends User{
	
	public Vendedor(String name, String cpf, String email, String type) {
		super (name, cpf, email, type);
	}
	
	@Override
	public String getRole() {
		
		return "Vendedor";
	}

}