package projEscola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import servicos.ConexaoBanco;

public class AlunoBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	@SuppressWarnings("static-access")
	public AlunoBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}
	
	static void finalizaCadastro (String matriculaP, String matriculaA, String curso, String disciplina) throws SQLException {

		stmt = con.prepareStatement("select * from escola.materias");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;

		stmt = con.prepareStatement("INSERT INTO escola.materias (id, matriculaP, matriculaA, curso, disciplina , turma)"
				  + " VALUES ("+x+", '"+matriculaP+"', '"+matriculaA+"' , '"+curso+"', '"+disciplina+"', '"+curso+"')");
		stmt.executeUpdate();	
	}
	
	@SuppressWarnings("static-access")
	public boolean validaUsuario(String matricula) throws SQLException {

		stmt = this.con.prepareStatement("select * from escola.materias x where x.matriculaA ='"+matricula+"'");
		ResultSet result = stmt.executeQuery();
		if(result.next() == true)
			return true;
		else
			return false;
	}
}