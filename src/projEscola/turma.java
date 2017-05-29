package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class turma {
	
	long matricula;

	@SuppressWarnings("rawtypes")
	static Vector getTurmas(String selecionaDisciplina) throws SQLException{
		Vector turmas = new turmaBD().getTurmas(selecionaDisciplina);
		Vector<String> arruma = new Vector<String>();
		for(int i=0;i<turmas.size();i++){
			arruma.insertElementAt(turmas.elementAt(i).toString().substring(1, turmas.elementAt(i).toString().length()-1), i);
		}
		return arruma;
	}
	
}
