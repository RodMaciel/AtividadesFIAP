package Health.Pack;
/**
 * Classe cria o Usuario pessoal
 * @author Rodrigo
 * @version 1.0
 */
public class  Pessoal extends Usuario{
	/**
	 * Codigo do paciente para consulta
	 */
	private int	codigoPaciente;
	/**
	 * Flag para verificar se o usuario � premium
	 */
	private boolean premium;
	/**
	 * Peso Inicial da pessoa
	 */
	private float pesoInicial;
	/**
	 * Peso atual da pessoa
	 */
	private float pesoAtual;
	/**
	 * Altura da pessoa
	 */
	private float altura;
	/**
	 * Bpm da pessoa
	 */
	private int bpm;
	/**
	 * Imc da pessoa
	 */
	private float imc;
	
	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public float getPesoInicial() {
		return pesoInicial;
	}
	public void setPesoInicial(float pesoInicial) {
		this.pesoInicial = pesoInicial;
	}
	public float getPesoAtual() {
		return pesoAtual;
	}
	public void setPesoAtual(float pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	/**
	 * Construtor para o usuario pessoal
	 * @param nome
	 * @param email
	 * @param senha
	 * @param telefone
	 * @param endereco
	 * @param idade
	 * @param tipoUsuario
	 * @param codigoPaciente
	 * @param premium
	 * @param pesoInicial
	 * @param pesoAtual
	 * @param altura
	 * @param bpm
	 * @param imc
	 */
	public Pessoal(String nome, String email, String senha, String telefone, String endereco, int idade,
			String tipoUsuario, int codigoPaciente, boolean premium, float pesoInicial, float pesoAtual, float altura,
			int bpm, float imc) {
		super(nome, email, senha, telefone, endereco, idade, tipoUsuario);
		this.codigoPaciente = codigoPaciente;
		this.premium = premium;
		this.pesoInicial = pesoInicial;
		this.pesoAtual = pesoAtual;
		this.altura = altura;
		this.bpm = bpm;
		this.imc = imc;
	}

}
