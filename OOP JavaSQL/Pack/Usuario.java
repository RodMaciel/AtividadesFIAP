package Health.Pack;
/**
 * Classe cria o Usuario
 * @author Leonardo Antunes
 * @version 1.0
 */
public class Usuario {
	/**
	 * Nome do Usu�rio. 
	 */
	private String nome;
	/**
	 * email do Usu�rio.
	 */
    private String email;
	/**
	 * senha do Usu�rio. 
	 */
    private String senha;
	/**
	 * telefone do Usu�rio. 
	 */
    private String telefone;
	/**
	 * endereco do Usu�rio. 
	 */
    private String endereco;
	/**
	 * idade do Usu�rio. 
	 */
    private int idade;
	/**
	 * codigo do Usuario do Usu�rio. 
	 */
    private int codigoUsuario;
    
    private String tipoUsuario;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipoUsuario(){
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
         this.telefone = telefone;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getIdade(){
        return idade;
    }
    public void SetIdate(int idade){
        this.idade = idade;
    }
    public int getCodigoUsuario(){
        return codigoUsuario;
    }
    
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    /**
     *  Futuro m�todo para adicionar usu�rio e armazenar no banco.
     */
   /* public Usuario adicionarUsuario(String nome,String email,String senha,String telefone,String endereco,int idade){
       
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
        this.codigoUsuario = 123;
        return this;
    }*/
    
    public Usuario(){
    	
     }
    /**
     * Construtor Cria o usu�rio atrav�s dos parametros estabelecidos. 
     * @param nome
     * @param email
     * @param senha
     * @param telefone
     * @param endereco
     * @param idade
     */
   public Usuario(String nome,String email,String senha,String telefone,String endereco,int idade,String tipoUsuario){
       this.nome = nome;
       this.email = email;
       this.senha = senha;
       this.telefone = telefone;
       this.endereco = endereco;
       this.idade = idade;
       this.codigoUsuario = codigoUsuario;
       this.tipoUsuario = tipoUsuario;
    }
   /**
    * M�todo para transformar o endere�o de memoria em um objeto legivel.
    */
   public String toString() {
       return this.nome + "," + this.email + "," + this.senha + "," + this.telefone + "," + this.endereco + "," + this.idade + "," + this.codigoUsuario ;
   }
    public void excluirUsuario(int codigoPessoa){

    }
}
