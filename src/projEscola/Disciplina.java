package projEscola;

import java.sql.SQLException;

public class Disciplina {
	String disciplina;
	
	String[] getDisciplina (String curso) {
		return null;
		
	}
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		disciplinaBD.setDisciplina (matricula,  curso,  disciplina);
		
	}
}