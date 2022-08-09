package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

public class HistoricoDao {
	private Connection con = Conexao.getConnection();

	public List<Historico> getAll(){
		List<Historico> historico = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM HISTORICO";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
				  Historico hist = new Historico();
				  hist.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
				  hist.setCodigoExercicio(rs.getInt("CODIGOEXERCICIO"));
				  hist.setCodigoGastosCal(rs.getInt("CODIGOGASTOSCAL"));
				  hist.setCodigoHistorico(rs.getInt("CODIGOHISTORICO"));
				  Date data = rs.getDate("HISTORICO");
				  hist.setData(data);	
				  historico.add(hist);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return historico;
	}
	
	public void insertHistorico(Historico historico) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO HISTORICO" +" (CODIGOHISTORICO,CODIGOEXERCICIO,CODIGOGASTOSCAL,CODIGOUSUARIO,HISTORICO)"+" VALUES (?, ?, ?,?,?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setInt(1,historico.getCodigoHistorico());
			preparador.setInt(2,historico.getCodigoExercicio());
			preparador.setInt(3,historico.getCodigoGastosCal());
			preparador.setInt(4,historico.getCodigoUsuario());
			preparador.setDate(5,new java.sql.Date(0));
			preparador.execute();
			conexao.commit();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel salvar nos banco"+e.getMessage());
			
		}
	}
}
