package projEscola;

import java.sql.SQLException;

public class Professor extends Pessoa {
	
	public static void cadastraTurma (String matriculaP, String curso, String disciplina) throws SQLException {
		ProfessorBD.cadastraTurma(matriculaP, curso, disciplina);
	}

	static int getQtd(String matriculaP) throws SQLException{
		return new ProfessorBD().getQtd(matriculaP);
	}
	
}
