package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cursoBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	static boolean validaSenha (String matricula, String senha) throws SQLException {
		con = DriverManager.getConnection(url, "user","password");
		stmt = con.prepareStatement("select * from inventory");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			if(result.getString("Matricula")==matricula){
				if(result.getString("Senha")==senha){
					return true;
				}
				return false;
			}
		}
		return false;
	}
}