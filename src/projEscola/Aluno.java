package projEscola;

import java.sql.SQLException;

public class Aluno extends Pessoa {

	static void finalizaCadastro (String matriculaP, String matriculaA, String curso, String[] disciplina) throws SQLException {
		AlunoBD.finalizaCadastro(matriculaP, matriculaA, curso, disciplina);
	}
	
	static boolean validaUsuario (String matricula) throws SQLException {
		return new AlunoBD().validaUsuario(matricula);		
	}
		
}
