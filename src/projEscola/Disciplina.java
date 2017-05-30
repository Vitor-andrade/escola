package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Disciplina {
	String disciplina;
	
	@SuppressWarnings("rawtypes")
	static Vector getDisciplinas(String selecionaCurso) throws SQLException{
		Vector disciplinas = new DisciplinaBD().getDisciplinas(selecionaCurso);
		Vector<String> arruma = new Vector<String>();
		for(int i=0;i<disciplinas.size();i++){
			arruma.insertElementAt(disciplinas.elementAt(i).toString().substring(1, disciplinas.elementAt(i).toString().length()-1), i);
		}
		return arruma;
	}
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		DisciplinaBD.setDisciplina (matricula,  curso,  disciplina);
		
	}
}