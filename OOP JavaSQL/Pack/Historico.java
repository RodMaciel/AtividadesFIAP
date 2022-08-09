package Health.Pack;
import java.util.Date;
/**
 * 
 * @author Leonardo Antunes
 * Classe do Calendario onde a pessoa irá acessar o historico de informações.
 *@version 1.0
 */
public class Historico {
	/**
	 * Data Irá trazer data.
	 */
	 private Date data;
		/**
		 * codigoExercicio Irá trazer os dados do  objeto exercicio.
		 */
	 private int codigoExercicio;
		/**
		 * codigoExercicio Irá trazer os dados do objeto GastosCal.
		 */
	 private int codigoGastosCal;

		/**
		 * codigo do Historico Irá trazer os dados do objeto GastosCal.
		 */
	 private int codigoHistorico;
	 
	 private int codigoUsuario;


	    public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	    public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
		public int getCodigoExercicio() {
	        return codigoExercicio;
	    }
	    public void setCodigoExercicio(int codigoExercicio) {
	        this.codigoExercicio = codigoExercicio;
	    }
	    public int getCodigoGastosCal(){
	        return codigoGastosCal;
	    }
	    public void setCodigoGastosCal(int codigoGastosCal) {
	    	this.codigoGastosCal = codigoGastosCal;
	    }
	    
	    public int getCodigoHistorico() {
	        return codigoHistorico;
	    }
	    public void setCodigoHistorico(int codigoHistorico) {
	        this.codigoHistorico = codigoHistorico;
	    }
		public Historico(Date data, int codigoExercicio, int codigoGastosCal, int codigoHistorico,
				int codigoUsuario) {
			super();
			this.data = data;
			this.codigoExercicio = codigoExercicio;
			this.codigoGastosCal = codigoGastosCal;
			this.codigoHistorico = codigoHistorico;
			this.codigoUsuario = codigoUsuario;
		}
		public Historico() {
			
		}
		@Override
		public String toString() {
			return "Historico [data=" + data + ", codigoExercicio=" + codigoExercicio + ", codigoGastosCal="
					+ codigoGastosCal + ", codigoHistorico=" + codigoHistorico + ", codigoUsuario=" + codigoUsuario
					+ "]";
		}
	    
}
