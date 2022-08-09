package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
	private Connection con = Conexao.getConnection();
		
	public List<Usuario> getAll(){
		List<Usuario> usuarios = new ArrayList<>();
		try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  System.out.println("Classe para nome Oracle Driver!");
	    	  Connection conexao = DriverManager.getConnection(
			      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
	    	  System.out.println("Conectado!");
	    	  
	    	  String sql = "SELECT * FROM USUARIO";
	    	  Statement stmt = conexao.createStatement();
	    	  ResultSet rs = stmt.executeQuery(sql);
			  System.out.println("Conectado select");
			  while(rs.next()){
	            Usuario u = new Usuario();
	            u.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
	            u.setNome(rs.getString("NOME"));
	            u.setSenha(rs.getString("SENHA"));
	            usuarios.add(u);
	          }	  	    	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return usuarios;
	}
	
	public void insertUsuario(Usuario usuario) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Classe para nome Oracle Driver!");
			Connection conexao = DriverManager.getConnection(
		      "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92589", "251093");
			System.out.println("Conectado!");
			
			String sql = "INSERT INTO USUARIO" +" (CODIGOUSUARIO, NOME, SENHA)"+" VALUES (?, ?, ?)";
			
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setInt(1,usuario.getCodigoUsuario());
			preparador.setString(2,usuario.getNome());
			preparador.setString(3,usuario.getSenha());
	    	
			preparador.execute();
			preparador.close();
			
			System.out.println("Dados salvos com sucesso");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possível salvar nos banco"+e.getMessage());
			
		}
	}
}
