package Health.Pack;
/**
 * Classe Atividades  irá adicionar o atividade feita.
 * @author Leonardo Antunes
 * @version 1.0
 *
 */
public class Atividades {
	/**
	 * Nome da Atividade.
	 */
	private String nomeAtv;
	private int codigoUsuario;
	/**
	 * Gastos caloricos da Atividade.
	 */
    private int gastosCalAtv;
	/**
	 * Codigo da Atividade.
	 */
    private int codigoAtv;

    public String getNomeAtv(){
        return nomeAtv;
    }
    public void setNomeAtv(String nomeAtv){
        this.nomeAtv = nomeAtv;
    }
    public int getGastosCalAtv(){
        return gastosCalAtv;
    }
    public void setGastosCalAtv(int gastosCalAtv){
        this.gastosCalAtv = gastosCalAtv;
    }
    public int getCodigoAtv(){
        return codigoAtv;
    }
    public void setCodigoAtv(int codigoAtv) {
    	this.codigoAtv = codigoAtv;
    }
    public int getCodigoUsuario() {
  		return codigoUsuario;
  	}
  	public void setCodigoUsuario(int codigoUsuario) {
  		this.codigoUsuario = codigoUsuario;
  	}
    /**
     * Método para adicionar atividades.
     * @param nomeAtv
     * @param gastosCalAtv
     */
    public void Atividades(String nomeAtv,int gastosCalAtv,int codigoAtv,int codigoUsuario){
        this.nomeAtv = nomeAtv;
        this.gastosCalAtv = gastosCalAtv;
        this.codigoAtv = codigoAtv;
        this.codigoUsuario = codigoUsuario;
    }
    /**
     * Método que irá remover as Atividades.
     * @param codigoAtv
     */
    public void removerAtividades(int codigoAtv){
        
    }
	/**
     * Construtor para montar as atividades.
     * @param nomeAtv
     * @param gastosCalAtv
     */
    public Atividades(String nomeAtv,int gastosCalAtv,int codigoAtv,int codigoUsuario){
        this.nomeAtv = nomeAtv;
        this.gastosCalAtv = gastosCalAtv;
        this.codigoAtv = codigoAtv;
        this.codigoUsuario = codigoUsuario;
    }
    @Override
	public String toString() {
		return "Atividades [nomeAtv=" + nomeAtv + ", codigoUsuario=" + codigoUsuario + ", gastosCalAtv=" + gastosCalAtv
				+ ", codigoAtv=" + codigoAtv + "]";
	}
   public Atividades(){
   }
}
