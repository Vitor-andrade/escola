package projEscola;

import java.sql.SQLException;

public class Pessoa {

	private String matricula;
	String senha;
	String nome;
	boolean admin;
	
	static boolean validaSenha (String matricula, String senha) throws SQLException {
		return new PessoaBD().validaSenha(matricula, senha);
	}
	
	@SuppressWarnings("static-access")
	static void setPessoa (String matricula, String senha, String nome, String x) throws SQLException {
		new PessoaBD().setPessoa(matricula,senha,nome, x);
	}
	
	static int getPerfilUsuario(String matricula) throws SQLException{
		return new PessoaBD().getPerfilUsuario(matricula);
	}
	
	static String getNomeUsuario(String matricula) throws SQLException{
		return new PessoaBD().getNomeUsuario(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}