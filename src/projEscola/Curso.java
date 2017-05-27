package projEscola;

import java.sql.SQLException;
import java.util.Vector;

public class Curso {
	
	long matricula;

	@SuppressWarnings("rawtypes")
	static Vector getCursos() throws SQLException{
		return new cursoBD().getCursos();
	}
	
}
