package Health.Pack;
/**
 * Classe AlimentosRef  ir� adicionar qual tipo de refei��o o alimento ser� adicionado.
 * @author Rodrigo
 * @version 1.0
 *
 */
public class AlimentacaoRef {
	/**
	 * Tipo de refei��o
	 */
	private String tipoRef;
	/**
	 * codigo da refei��o
	 */
    private int codigoRef;
    /**
     * codigo do alimento
     */
    private int codigoAlimento;

    public String getTipoRef(){
        return tipoRef;
    }
    public int getCodigoAlimento() {
        return codigoAlimento;
    }
    public void setCodigoAlimento(int codigoAlimento) {
    	this.codigoAlimento = codigoAlimento;
    }
    
    public int getCodigoRef() {
        return codigoRef;
    }
    public void setCodigoRef(int codigoRef) {
    	this.codigoRef = codigoRef;
    }
    public void SetTipoRef(String tipoRef){
        this.tipoRef = tipoRef;
    }
	public AlimentacaoRef(String tipoRef, int codigoRef, int codigoAlimento) {
		super();
		this.tipoRef = tipoRef;
		this.codigoRef = codigoRef;
		this.codigoAlimento = codigoAlimento;
	}
	@Override
	public String toString() {
		return "AlimentacaoRef [tipoRef=" + tipoRef + ", codigoRef=" + codigoRef + ", codigoAlimento=" + codigoAlimento
				+ "]";
	}
 public AlimentacaoRef() {
	 
 }

}
