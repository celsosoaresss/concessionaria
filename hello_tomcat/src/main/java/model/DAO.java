package model;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private String driver = "org.postgresql.Driver";
    private String URL = "jdbc:postgresql://localhost:5432/concessionaria";
    private String USER = "postgres";
    private String PASSWORD = "0090";
    
    private Connection conn;
    
    public DAO(){
    	this.conectar();
    }
    
    // MÉTODO DE CONEXÃO
    private void conectar() {
        try {
            Class.forName(driver); 
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getQuery(String sql, List<String> params) {
    	
    	try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            for (int i = 0; i < params.size(); i++) {
            	int pos = i + 1;
            	
    			stmt.setString(pos, params.get(i));
    			System.out.println(pos+": "+ params.get(i));
    		}
            
            ResultSet rs = stmt.executeQuery();
            
            return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return null;
    	
    }
}