package projEscola;

import java.sql.SQLException;

public class professor extends Pessoa {
	
	static void setProfessor (String matricula, String senha, String nome)throws SQLException {
		professorBD.setProfessor (matricula,senha,nome);
	}

}
