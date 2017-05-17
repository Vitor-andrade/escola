package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class professorBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	static void setProfessor (String matricula , String senha, String nome) throws SQLException {
		con = DriverManager.getConnection(url, "user", "password");
		stmt = con.prepareStatement("select * from escola.pessoas");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;
		
		stmt = con.prepareStatement("INSERT INTO escola.pessoas (id, matricula, senha, nome , pessoa)"
				  + " VALUES ("+x+", '"+matricula+"', '"+senha+"' , '"+nome+"', '1')");
		stmt.executeQuery();
	}
	
}
