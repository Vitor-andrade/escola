package projEscola;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class turma {
	
	long matricula;

	static DefaultTableModel buscaTurmaCadastro() throws SQLException{
		return new turmaBD().buscaTurmaCadastro();
	}
	
}
