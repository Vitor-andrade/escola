package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class disciplinaBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		con = DriverManager.getConnection(url, "user", "password");
		stmt = con.prepareStatement("select * from escola.meterias");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;
		
		stmt = con.prepareStatement("INSERT INTO escola.materias (id, matriculaP, matriculaA , curso , disciplina, turma)"
				  + " VALUES ("+x+", '"+matricula+"', null , '"+curso+"','"+disciplina+"', null )");
		stmt.executeQuery();
	}
	
}