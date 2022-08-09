package Health.Pack;
/**
 * 
 * @author Leonardo Antunes
 * Classe dos GastosCaloricos onde irá calcular os gastos caloricos das atividades junto com as refeições.
 *@version 1.0
 */
public class GastosCal {
	/**
	 * codigo dos Gastos Caloricos 
	 */
	private int codigoGastosCal;
	/**
	 * codigo das refeições onde irá trazer o objeto refeição.
	 */
	private int codigoRef;
	/**
	 * codigo das refeições onde irá trazer o objeto atividades.
	 */
	private int codigoAtv;

    public int getCodigoGastosCal(){
        return codigoGastosCal;
    }
    public void setCodigoGastosCal(int codigoGastosCal) {
    	this.codigoGastosCal = codigoGastosCal;
    }
    
    public int getCodigoRef() {
        return codigoRef;
    }
    public void setCodigoRef(int codigoRef) {
    	this.codigoRef = codigoRef;
    }
    public void setCodigoAtv(int codigoAtv) {
    	this.codigoAtv = codigoAtv;
    }
    public int getCodigoAtv(){
        return codigoAtv;
    }
    /**
     * Metodo que irá calcular as calorias.
     */
    /*public float calculoCalorias(){

    }*/
	public GastosCal(int codigoGastosCal, int codigoRef, int codigoAtv) {
		super();
		this.codigoGastosCal = codigoGastosCal;
		this.codigoRef = codigoRef;
		this.codigoAtv = codigoAtv;
	}
	@Override
	public String toString() {
		return "GastosCal [codigoGastosCal=" + codigoGastosCal + ", codigoRef=" + codigoRef + ", codigoAtv=" + codigoAtv
				+ "]";
	}
    
}
