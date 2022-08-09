package Health.Pack;
/**
 * Classe cria o Usuario nutricionista
 * @author Leonardo Antunes
 * @version 1.0
 */
public class Nutri extends Usuario{
	/**
	 *  crn do nutricionista
	 */
	private int crn;
	/**
	 * codigo do nutricionista
	 */
	private int codigoNutri;
	public int getCrn() {
		return crn;
	}
	public void setCrn(int crn) {
		this.crn = crn;
	}
	public int getCodigoNutri() {
		return codigoNutri;
	}
	public void setCodigoNutri(int codigoNutri) {
		this.codigoNutri = codigoNutri;
	}
	/**
	 * Construtor do nutricionista
	 * @param nome
	 * @param email
	 * @param senha
	 * @param telefone
	 * @param endereco
	 * @param idade
	 * @param tipoUsuario
	 * @param crn
	 * @param codigoNutri
	 */
	public Nutri(String nome, String email, String senha, String telefone, String endereco, int idade,
			String tipoUsuario, int crn, int codigoNutri) {
		super(nome, email, senha, telefone, endereco, idade, tipoUsuario);
		this.crn = crn;
		this.codigoNutri = codigoNutri;
	}
	

}
