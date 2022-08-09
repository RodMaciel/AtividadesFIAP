package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlimentosDao {
private Connection con = Conexao.getConnection();
	
	public List<Alimentos> getAll(){
		List<Alimentos> alimentos = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM ALIMENTOS";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
	            Alimentos ali = new Alimentos();
	            ali.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
	            ali.setCaloriasAlimento(rs.getInt("CALORIASALIMENTO"));
	            ali.setCodigoAlimento(rs.getInt("CODIGOALIMENTO"));
	            ali.setNomeAlimento(rs.getString("NOMEALIMENTO"));
	            
	            alimentos.add(ali);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return alimentos;
	}
	
	public void insertAlimentos(Alimentos alimentos) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO ALIMENTOS" +" (NOMEALIMENTO,CODIGOALIMENTO,CALORIASALIMENTO,CODIGOUSUARIO)"+" VALUES (?, ?, ?,?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1,alimentos.getNomeAlimento());
			preparador.setInt(2,alimentos.getCodigoAlimento());
			preparador.setInt(3,alimentos.getCaloriasAlimento());
			preparador.setInt(4,alimentos.getCodigoUsuario());
	    	
			preparador.execute();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel salvar nos banco"+e.getMessage());
			
		}
	}
}
