package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection(){
		Connection conexao = null;
		try {
		      //Registra o Driver
		      Class.forName("oracle.jdbc.driver.OracleDriver");

		      //Abre uma conex�o
		      conexao = DriverManager.getConnection(
				      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
		      
		      System.out.println("Conectado!");
		      		      
		    //Tratamento de erro  
		    } catch (SQLException e) {
		      System.err.println("N�o foi poss�vel conectar no Banco de Dados");
		      e.printStackTrace();
		    } catch (ClassNotFoundException e) {
		      System.err.println("O Driver JDBC n�o foi encontrado!");
		      e.printStackTrace();
		    }
		
		return conexao;
	}
}