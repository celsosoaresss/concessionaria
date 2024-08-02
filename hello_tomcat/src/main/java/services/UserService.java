package services;

import java.util.List;

import model.User;
import repo.UserDAO;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService(){
		this.userDAO = new UserDAO();
	}
	
	public boolean login(String email, String pass) throws Exception {
		User user = this.userDAO.getUserByEmail(email, pass);
	
	
		if(user == null) {
			throw new Exception("Usuario não encontrado");
		}
		
		return true;
	}
	
	public List<User> getAll(){
		return this.userDAO.getAllUsers();
	}
	
}
