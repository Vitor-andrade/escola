package projEscola;

import java.sql.SQLException;

public class aluno extends Pessoa {

	static void finalizaCadastro (String matriculaP, String matriculaA, String curso, String[] disciplina) throws SQLException {
		alunoBD.finalizaCadastro(matriculaP, matriculaA, curso, disciplina);
	}
	
	static void setAluno (String matricula, String senha, String nome) throws SQLException {
		new alunoBD().setAluno(matricula,senha,nome);
	}
	
	static boolean validaUsuario (String matricula, String senha, String nome) throws SQLException {
		return new alunoBD().validaUsuario(matricula, senha, nome);		
	}
		
}
