package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Turma {
	
	@SuppressWarnings("rawtypes")
	static Vector getTurmas(String disciplina) throws SQLException{
		Vector turmas = new TurmaBD().getTurmas(disciplina);
		Vector<String> arruma = new Vector<String>();
		for(int i=0;i<turmas.size();i++){
			arruma.insertElementAt(turmas.elementAt(i).toString().substring(1, turmas.elementAt(i).toString().length()-1), i);
		}
		return arruma;
	}
	
	static int getId(String disciplina) throws SQLException{
		return new TurmaBD().getId(disciplina);
	}
	
	public static String getProfessor(String id) throws SQLException{
		return new TurmaBD().getProfessor(id);
	}
}
