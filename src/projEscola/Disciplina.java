package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Disciplina {
	String disciplina;
	
	@SuppressWarnings("rawtypes")
	static Vector getDisciplinas() throws SQLException{
		return new disciplinaBD().getDisciplinas();
	}
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		disciplinaBD.setDisciplina (matricula,  curso,  disciplina);
		
	}
}