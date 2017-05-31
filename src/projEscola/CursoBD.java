package projEscola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.jdbc.ResultSetMetaData;

import servicos.ConexaoBanco;

public class CursoBD {
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	public CursoBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}
	
	public Vector getCursos() throws SQLException {
		
		stmt = this.con.prepareStatement("select x.curso from escola.materias x");
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
	        if(data.contains(vector)){
	        	continue;
	        }
	        data.add(vector);
	    }

	    return data;

	}

}
