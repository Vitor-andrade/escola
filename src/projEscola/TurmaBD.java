package projEscola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

import servicos.ConexaoBanco;

public class TurmaBD {
	
	static String host = "127.0.0.1";
	static int port = 3306;
	static String dbName = "escola";
	static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	static ConexaoBanco conexao;
	static Connection con = null;
	static PreparedStatement stmt = null;
	
	public TurmaBD(){
		this.conexao = ConexaoBanco.getInstance();
		this.con = conexao.getConexao();
	}
	
	public Vector getTurmas(String selecionaDisciplina) throws SQLException {
		
		stmt = this.con.prepareStatement("select x.turma from escola.materias x where x.disciplina='"+selecionaDisciplina+"'");
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
}