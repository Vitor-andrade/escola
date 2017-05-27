package projEscola;

import java.sql.SQLException;

public class aluno extends Pessoa {

	static void finalizaCadastro (String matriculaP, String matriculaA, String curso, String[] disciplina) throws SQLException {
		alunoBD.finalizaCadastro(matriculaP, matriculaA, curso, disciplina);
	}
	
	static boolean validaUsuario (String matricula) throws SQLException {
		return new alunoBD().validaUsuario(matricula);		
	}
		
}
