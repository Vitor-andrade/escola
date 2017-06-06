package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import servicos.ConexaoBanco;

public class ProfessorBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	@SuppressWarnings("static-access")
	public ProfessorBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}

	public static void cadastraTurma(String matriculaP, String curso, String disciplina) throws SQLException {
		
		stmt = con.prepareStatement("select * from escola.materias");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;

		stmt = con.prepareStatement("INSERT INTO escola.materias (id, matriculaP, matriculaA, curso, disciplina , turma)"
				  + " VALUES ("+x+", '"+matriculaP+"', null , '"+curso+"', '"+disciplina+"', '"+curso+"')");
		stmt.executeUpdate();	
		
	}

	public int getQtd(String matriculaP) throws SQLException {
		stmt = this.con.prepareStatement("select x.id from escola.materias x where x.matriculaP like '"+matriculaP+"' and x.matriculaA is null");
		ResultSet result = stmt.executeQuery();
		
		int i = 0;
		
		while(result.next()) {
		    i++;
		}
		
		return i;
	}
	
}
