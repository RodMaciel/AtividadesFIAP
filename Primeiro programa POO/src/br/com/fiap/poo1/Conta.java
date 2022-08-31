package br.com.fiap.poo1;

public class Conta{

private String agencia;
private String Conta;
private Cliente cliente;
public float Saldo;

public String getAgencia() {
	return agencia;
}
public void setAgencia(String agencia) {
	this.agencia = agencia;
}
public String getConta() {
	return Conta;
}
public void setConta(String conta) {
	Conta = conta;
}

public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public float getSaldo() {
	return Saldo;
}
public float Depositar(float valor) {
	Saldo = Saldo + valor;
	return Saldo;
}
public Boolean Sacar(float valorSaque) {
	if(valorSaque < Saldo) {
		Saldo = Saldo - valorSaque;
		return true;
	}
	else {
		return false;
	}
}
	public Conta() {
		this.cliente = new Cliente();
		
	}
	public Conta(String agencia, String Conta, String cpf) {
		this.cliente = new Cliente(cpf);
		this.agencia = agencia;
		this.Conta = Conta;
		
}
	@Override
	public String toString() {
		return " O numero da Agencia eh: = " + agencia + ", \n Conta=" + Conta + ", \n " + cliente + ", \n Saldo=" + Saldo + "";
	}

}




