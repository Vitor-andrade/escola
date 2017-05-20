package servicos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBanco {
	
	private String host = "127.0.0.1";
	private int port = 3306;
	private String dbName = "escola";
	private String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	private static ConexaoBanco instancia = null;
	private Connection con = null;
	private PreparedStatement stmt = null;
	
	private ConexaoBanco(){
		try {
			this.con = DriverManager.getConnection(url, "root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ConexaoBanco getInstance() {
		
		if(instancia == null)
			instancia = new ConexaoBanco();
				
		return instancia;
	}
	
	public Connection getConexao(){
		return this.con;
	}
	
	public int getPerfilUsuario(String matricula){
		
		return 0;
	}
}
