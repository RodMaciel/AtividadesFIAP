package Health.Pack;
/**
 * Classe Alimentos  ir� adicionar os alimentos ingeridos.
 * @author Leonardo Antunes
 * @version 1.0
 *
 */
public class Alimentos {
	/**
	 * Nome do Alimento.
	 */
	private int CodigoUsuario;
	public int getCodigoUsuario() {
		return CodigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		CodigoUsuario = codigoUsuario;
	}
	private String nomeAlimento;
	/**
	 * codigo do Alimento.
	 */
    private int codigoAlimento;
    /**
     * Calorias dos Alimentos.
     */
    private int caloriasAlimento;

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public int getCodigoAlimento() {
        return codigoAlimento;
    }
    public void setCodigoAlimento(int codigoAlimento) {
    	this.codigoAlimento = codigoAlimento;
    }

    public int getCaloriasAlimento() {
        return caloriasAlimento;
    }

    public void setCaloriasAlimento(int caloriasAlimento) {
        this.caloriasAlimento = caloriasAlimento;
    }
    /**
     * M�todo que ir� para adicionar Alimentos.
     * @param nomeAlimento
     * @param caloriasAlimento
     */
    public Alimentos(int codigoUsuario, String nomeAlimento, int codigoAlimento, int caloriasAlimento) {
		super();
		this.CodigoUsuario = codigoUsuario;
		this.nomeAlimento = nomeAlimento;
		this.codigoAlimento = codigoAlimento;
		this.caloriasAlimento = caloriasAlimento;
	}

	@Override
	public String toString() {
		return "Alimentos [CodigoUsuario=" + CodigoUsuario + ", nomeAlimento=" + nomeAlimento + ", codigoAlimento="
				+ codigoAlimento + ", caloriasAlimento=" + caloriasAlimento + "]";
	}

	/**
     * M�todo que ir� remover os alimentos.
     * @param codigoAlimento
     */
    /**
     * Construtor para montar o objeto alimentos.
     * @param tipoRef
     */
    public Alimentos(){
    }
}
