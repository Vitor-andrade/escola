package projEscola;

import java.sql.SQLException;

public class Pessoa {

	long matricula;
	String senha;
	String nome;
	boolean admin;
	
	static int validaSenha (String matricula, String senha) throws SQLException {
		return pessoaBD.validaSenha(matricula, senha);
	}
}