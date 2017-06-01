package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import servicos.ConexaoBanco;

public class PessoaBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	public PessoaBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}
	
	public boolean validaSenha (String matricula, String senha) throws SQLException {
		
		stmt = this.con.prepareStatement("select x.matricula, x.senha, x.pessoa from escola.pessoas x where x.matricula ='"+matricula+
				"' and x.senha='"+ senha + "'");
		ResultSet result = stmt.executeQuery();
		if(result.next() == true)
			return true;
		else
			return false;
		
	}
	
	static void setPessoa (String matricula , String senha, String nome, String pessoa) throws SQLException {

		stmt = con.prepareStatement("select x.* from escola.pessoas x");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;
		
		stmt = con.prepareStatement("INSERT INTO escola.pessoas (id, matricula, senha, nome , pessoa)"
				  + " VALUES ("+x+", '"+matricula+"', '"+senha+"' , '"+nome+"', "+pessoa+")");
		stmt.executeUpdate();
	}
	
	public int getPerfilUsuario(String matricula) throws SQLException{
		stmt = this.con.prepareStatement("select x.pessoa from escola.pessoas x where x.matricula ='"+matricula+"'" );
		ResultSet result = stmt.executeQuery();
		result.next();
		return result.getInt("pessoa");
	}

	public String getNomeUsuario(String matricula) throws SQLException {
		stmt = this.con.prepareStatement("select x.nome from escola.pessoas x where x.matricula ='"+matricula+"'" );
		ResultSet result = stmt.executeQuery();
		result.next();
		return result.getString("nome");
	}

}