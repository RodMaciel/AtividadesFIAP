package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlimentacaoRefDao {
private Connection con = Conexao.getConnection();
	
	public List<AlimentacaoRef> getAll(){
		List<AlimentacaoRef> alimentacaoRef = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM ALIMENTACAOREF";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
				AlimentacaoRef aliRef = new AlimentacaoRef();
	            aliRef.SetTipoRef(rs.getString("TIPOREF"));
	            aliRef.setCodigoRef(rs.getInt("CODIGOREF"));
	            aliRef.setCodigoAlimento(rs.getInt("CODIGOALIMENTO"));	            
	            alimentacaoRef.add(aliRef);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return alimentacaoRef;
	}
	
	public void insertAlimentacaoRef(AlimentacaoRef alimentacaoRef) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO ALIMENTACAOREF" +" (TIPOREF,CODIGOALIMENTO,CODIGOREF)"+" VALUES (?, ?, ?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1,alimentacaoRef.getTipoRef());
			preparador.setInt(2,alimentacaoRef.getCodigoAlimento());
			preparador.setInt(3,alimentacaoRef.getCodigoRef());
	    	
			preparador.execute();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel salvar nos banco"+e.getMessage());
			
		}
	}
}
