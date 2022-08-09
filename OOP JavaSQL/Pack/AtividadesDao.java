package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class AtividadesDao {
	private Connection con = Conexao.getConnection();
	public List<Atividades> getAll(){
		List<Atividades> atividades = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92653", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM ATIVIDADES";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
	            Atividades a = new Atividades();
	            a.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
	            a.setNomeAtv(rs.getString("NOMEATV"));
	            a.setGastosCalAtv(rs.getInt("GASTOSCALATV"));
	            a.setCodigoAtv(rs.getInt("CODIGOATV"));
	            
	            atividades.add(a);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return atividades;
	}
	
	public void insertAtividades(Atividades atividades) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO ATIVIDADES" +" (CODIGOATV,GASTOSCALATV,NOMEATV,CODIGOUSUARIO)"+" VALUES (?, ?, ?,?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setInt(1,atividades.getCodigoAtv());
			preparador.setInt(2,atividades.getGastosCalAtv());
			preparador.setString(3,atividades.getNomeAtv());
			preparador.setInt(4,atividades.getCodigoUsuario());
	    	
			preparador.execute();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("N�o foi poss�vel salvar nos banco"+e.getMessage());
			
		}
	}
}
