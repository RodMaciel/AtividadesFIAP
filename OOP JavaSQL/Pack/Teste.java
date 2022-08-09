package Health.Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
		 * Classe para testes dos metodos das Classes Usu�rio e Exercicios.
		 * @author Rodrigo
		 * @version 1.0
		 *
		 */
public class Teste {
	  public static void main(String[] args){
		  AtividadesDao atv = new AtividadesDao();
		  UsuarioDao dao = new UsuarioDao();
		  AlimentosDao ali = new AlimentosDao();
		  HistoricoDao hist = new HistoricoDao();
		  ExerciciosDao exc = new ExerciciosDao();
		  AlimentacaoRefDao aliRef = new AlimentacaoRefDao();
		  try {	 
			dao.insertUsuario(new Usuario("Leo", "t@t.com", "1", "32612761", "av. dos canvas", 20,"Pessoal"));
			atv.insertAtividades(new Atividades("Corrida",130,1,1));
			ali.insertAlimentos(new Alimentos(1,"Banana",2,2));
			exc.insertExercicios(new Exercicios("agachamento",2000,50,2));
			aliRef.insertAlimentacaoRef(new AlimentacaoRef("janta",2,2));
			hist.insertHistorico(new Historico(new Date(),1,2,1,1));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		  
		  System.out.println(dao.getAll());
		  System.out.println(atv.getAll());
		  System.out.println(ali.getAll());
		  System.out.println(exc.getAll());
		  System.out.println(aliRef.getAll());
		  System.out.println(hist.getAll());
	      
	    }
	    
}
