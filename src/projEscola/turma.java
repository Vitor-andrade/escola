package projEscola;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JList;

public class turma {
	
	long matricula;

	@SuppressWarnings("rawtypes")
	static Vector getTurmas(String selecionaDisciplina) throws SQLException{
		return new turmaBD().getTurmas(selecionaDisciplina);
	}
	
}
