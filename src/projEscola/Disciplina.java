package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Disciplina {
	String disciplina;
	
	@SuppressWarnings("rawtypes")
	static Vector getDisciplinas(String selecionaCurso) throws SQLException{
		return new disciplinaBD().getDisciplinas(selecionaCurso);
	}
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		disciplinaBD.setDisciplina (matricula,  curso,  disciplina);
		
	}
}