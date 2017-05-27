package projEscola;

import java.sql.SQLException;

public class Pessoa {

	long matricula;
	String senha;
	String nome;
	boolean admin;
	
	static boolean validaSenha (String matricula, String senha) throws SQLException {
		return new pessoaBD().validaSenha(matricula, senha);
	}
	
	@SuppressWarnings("static-access")
	static void setPessoa (String matricula, String senha, String nome, String x) throws SQLException {
		new pessoaBD().setPessoa(matricula,senha,nome, x);
	}
	
	static int getPerfilUsuario(String matricula) throws SQLException{
		return new pessoaBD().getPerfilUsuario(matricula);
	}
}