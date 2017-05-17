package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pessoaBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	static int validaSenha (String matricula, String senha) throws SQLException {
		con = DriverManager.getConnection(url, "root","");
		stmt = con.prepareStatement("select x.matricula, x.senha, x.pessoa from escola.pessoas x");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			if(result.getString("matricula")==matricula){
				if(result.getString("senha")==senha){
					if(result.getInt("pessoa")==1){
						return 1;
					}
					if(result.getInt("pessoa")==2){
						return 2;
					}
					if(result.getInt("pessoa")==3){
						return 3;
					}
				}
				return 0;
			}
		}
		return 0;
	}
}