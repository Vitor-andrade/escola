package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Disciplina {
	String disciplina;
	
	@SuppressWarnings("rawtypes")
	static Vector getDisciplinas(String parametro, int parametro2) throws SQLException{
		// Parametro é passado por uma string que será usada no select.
		// Parametro2 é um int que diz ao metodo que caminho tomar.
		Vector disciplinas = new DisciplinaBD().getDisciplinas(parametro, parametro2);
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