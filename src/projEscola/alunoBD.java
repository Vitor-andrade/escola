package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class alunoBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	static void finalizaCadastro (String matriculaP, String matriculaA, String curso, String[] disciplina) throws SQLException {
		con = DriverManager.getConnection(url, "user", "password");
		stmt = con.prepareStatement("select * from escola.materias");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id");
		
		for(int i=0;i<disciplina.length;i++){
			x++;
			stmt = con.prepareStatement("INSERT INTO escola.materias (id, matriculaP, matriculaA, curso, disciplina , turma)"
					  + " VALUES ("+x+", '"+matriculaP+"', '"+matriculaA+"' , '"+curso+"', '"+disciplina+"', '"+curso+"')");
			stmt.executeQuery();	
		}
	}
	
	static void setAluno (String matricula , String senha, String nome) throws SQLException {
		con = DriverManager.getConnection(url, "user", "password");
		stmt = con.prepareStatement("select * from escola.pessoas");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;
		
		stmt = con.prepareStatement("INSERT INTO escola.pessoas (id, matricula, senha, nome , pessoa)"
				  + " VALUES ("+x+", '"+matricula+"', '"+senha+"' , '"+nome+"', '2')");
		stmt.executeQuery();
	}
}