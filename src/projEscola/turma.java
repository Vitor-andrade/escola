package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class turma {
	
	long matricula;

	@SuppressWarnings("rawtypes")
	static Vector getTurmas() throws SQLException{
		return new turmaBD().getTurmas();
	}
	
}
