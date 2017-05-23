package projEscola;

import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class turma {
	
	long matricula;

	static Vector buscaTurmaCadastro() throws SQLException{
		return new turmaBD().buscaTurmaCadastro();
	}
	
}
