package Health.Pack;
/**
 * Classe Exercicios onde o usuário irá adicionar o exercicio feito.
 * @author Leonardo Antunes
 * @version 1.0
 *
 */
public class Exercicios {
	/**
	 * nome do Exercicio. 
	 */
	private String nomeExc;
	/**
	 * valor das calorias gastas no exercicio.
	 */
    private int caloriasGastas;
	/**
	 * tempo do exercicio feito. 
	 */
    private int tempoExc;
	/**
	 * codigo dos Gastos Caloricos.
	 */
    private int codigoExercicio;

    public String getNomeExc(){
        return nomeExc;
    }
    public void setNomeExc(String nomeExc){
        this.nomeExc = nomeExc;
    }
    

	public int getCaloriasGastas() {
        return caloriasGastas;
    }

    public void setCaloriasGastas(int caloriasGastas) {
        this.caloriasGastas = caloriasGastas;
    }
    
    public int getTempoExc() {
        return tempoExc;
    }

    public void setTempoExc(int tempoExc) {
        this.tempoExc = tempoExc;
    }
    
    public int getCodigoExercicio() {
        return codigoExercicio;
    }
    public void setCodigoExercicio(int codigoExercicio) {
        this.codigoExercicio = codigoExercicio;
    }
    /**
     * Método que irá adicionar o exercicio feito.
     * @param codigoExercicio
     */
   /* public void adicionarExercicio(String nomeExc,int caloriasGastas,int tempoExc, int codigoExercicio ){
        this.nomeExc = nomeExc;
        this.caloriasGastas = caloriasGastas;
        this.tempoExc = tempoExc;
        this.codigoExercicio = codigoExercicio;
    }*/
    /**
     * Método que irá excluir o exercicio feito.
     * @param codigoExercicio
     */
    /**
     * Contrutor para adicionar o exercicio através dos parametros estabelecidos.
     * @param nomeExc
     * @param tempoExc
     * @param caloriasGastas
     */
    public Exercicios(String nomeExc, int caloriasGastas, int tempoExc, int codigoExercicio) {
		super();
		this.nomeExc = nomeExc;
		this.caloriasGastas = caloriasGastas;
		this.tempoExc = tempoExc;
		this.codigoExercicio = codigoExercicio;
	}
    public Exercicios() {

    }
    /**
     * Método para transformar o endereço de memoria em um objeto legivel.
     */
	@Override
	public String toString() {
		return "Exercicios [nomeExc=" + nomeExc + ", caloriasGastas=" + caloriasGastas + ", tempoExc=" + tempoExc
				+ ", codigoExercicio=" + codigoExercicio + "]";
	}

}
