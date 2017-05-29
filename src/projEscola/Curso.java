package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Curso {
	
	long matricula;

	@SuppressWarnings("rawtypes")
	static Vector getCursos() throws SQLException{
		Vector cursos = new cursoBD().getCursos();
		Vector<String> arruma = new Vector<String>();
		for(int i=0;i<cursos.size();i++){
			arruma.insertElementAt(cursos.elementAt(i).toString().substring(1, cursos.elementAt(i).toString().length()-1), i);
		}
		return arruma;
	}
	
}
