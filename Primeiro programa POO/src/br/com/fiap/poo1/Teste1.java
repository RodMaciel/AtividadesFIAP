package br.com.fiap.poo1;

public class Teste1 {
	public static void main(String[] args) {
Conta c1 = new Conta("0003","02032-3","323.323.323-32");
c1.getCliente().setNome(" Avelino");
c1.getCliente().setTelefone("(11)93234-0345");
float novoSaldo = c1.Depositar(100);
System.out.println(" O Saldo eh: " + novoSaldo);
System.out.println(c1.toString());

	}

}
