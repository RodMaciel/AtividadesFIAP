package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExerciciosDao {
	private Connection con = Conexao.getConnection();
	public List<Exercicios> getAll(){
		List<Exercicios> exercicios = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM EXERCICIOS";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
				  Exercicios exc = new Exercicios();
				  exc.setCodigoExercicio(rs.getInt("CODIGOEXERCICIO"));
				  exc.setNomeExc(rs.getString("NOMEEXC"));
				  exc.setTempoExc(rs.getInt("TEMPOEXC"));
				  exc.setCaloriasGastas(rs.getInt("CALORIASGASTAS"));
	            
				  exercicios.add(exc);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return exercicios;
	}
	
	public void insertExercicios(Exercicios exercicios) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO EXERCICIOS" +" (NOMEEXC,CALORIASGASTAS,TEMPOEXC,CODIGOEXERCICIO)"+" VALUES (?, ?, ?,?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1,exercicios.getNomeExc());
			preparador.setInt(2,exercicios.getCaloriasGastas());
			preparador.setInt(3,exercicios.getTempoExc());
			preparador.setInt(4,exercicios.getCodigoExercicio());
	    	
			preparador.execute();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel salvar nos banco"+e.getMessage());
			
		}
	}
}
