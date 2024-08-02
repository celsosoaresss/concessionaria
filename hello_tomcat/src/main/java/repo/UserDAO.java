package repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import arq.AbstractDAO;
import model.User;

public class UserDAO extends AbstractDAO {
	public UserDAO(){
		super();
	}
	
	public User getUserByEmail(String email, String pass) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = crypt(?, password)";
        try {
        	List<String> params = new ArrayList<String>();
        	
        	params.add(email);
        	params.add(pass);
           
        	ResultSet res = this.dao.getQuery(sql, params);
        	if (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                String cpf = res.getString("cpf");
                
                User user = new User(id, name, cpf, email);
                
                return user;
        	}

        	
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        return null;
	}

	public List<User> getAllUsers(){
        String sql = "SELECT * FROM users";
        try {
        	List<String> params = new ArrayList<String>();
        	List<User> users = new ArrayList<User>();
           
        	ResultSet res = this.dao.getQuery(sql, params);
        	while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                String cpf = res.getString("cpf");
                String email = res.getString("email");
                String type = res.getString("type");

                User user = new User(id, name, cpf, email, null, type); 
                users.add(user);
            }
        	
        	return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        return null;
	}
}
