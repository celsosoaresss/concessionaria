package arq;

import model.DAO;

public class AbstractDAO {
	
	protected DAO dao;
	
	public AbstractDAO(){
	    this.dao = new DAO();
	}
}
