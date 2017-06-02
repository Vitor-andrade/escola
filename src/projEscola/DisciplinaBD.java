package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.jdbc.ResultSetMetaData;

import servicos.ConexaoBanco;

public class DisciplinaBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	public DisciplinaBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}
	
	public Vector getDisciplinas(String selecionaCurso, int parametro2) throws SQLException {
		String coluna = null;
		
		if(parametro2==0){
			coluna= "curso";
		}else if(parametro2==1){
			coluna= "matriculaA";
		}
		
		stmt = this.con.prepareStatement("select x.disciplina from escola.materias x where x."+coluna+" like '"+selecionaCurso+"'");
		ResultSet result = stmt.executeQuery();
	    ResultSetMetaData metaData = (ResultSetMetaData) result.getMetaData();
	    
	    // Cabeçário
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // Data
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (result.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(result.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return data;

	}
	
	public Vector getDisciplinasComCurso(String matriculaP) throws SQLException {
		
		stmt = this.con.prepareStatement("select x.disciplina, x.curso from escola.materias x where x.matriculaP like '"+matriculaP+"'");
		ResultSet result = stmt.executeQuery();
	    ResultSetMetaData metaData = (ResultSetMetaData) result.getMetaData();
	    
	    // Cabeçário
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // Data
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (result.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(result.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return data;

	}
	
	static void setDisciplina (String matricula, String curso, String disciplina) throws SQLException {
		con = DriverManager.getConnection(url, "user", "password");
		stmt = con.prepareStatement("select * from escola.meterias");
		ResultSet result = stmt.executeQuery();
		result.afterLast();
		result.previous();
		int x= result.getInt("id")+1;
		
		stmt = con.prepareStatement("INSERT INTO escola.materias (id, matriculaP, matriculaA , curso , disciplina, turma)"
				  + " VALUES ("+x+", '"+matricula+"', null , '"+curso+"','"+disciplina+"', null )");
		stmt.executeQuery();
	}
	
}