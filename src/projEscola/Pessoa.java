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
	
	static int getPerfilUsuario(String matricula) throws SQLException{
		return new pessoaBD().getPerfilUsuario(matricula);
	}
}