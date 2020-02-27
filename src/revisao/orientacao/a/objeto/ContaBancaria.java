package revisao.orientacao.a.objeto;

public class ContaBancaria {
	private String nomeCorrentista;
	private String numeroConta;
	private double saldo;

	public ContaBancaria(String nomeCorrentista, String numeroConta, double saldo) {

		this.nomeCorrentista = nomeCorrentista;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		
		
	}
	
	public void saque(double valorSacado) {
		this.saldo -= valorSacado;
		
	}
	
	public void deposito (double valorDepositado) {
		this.saldo += valorDepositado;
		
	}
	
	public void extrato () {
		System.out.println("Nome: " + this.nomeCorrentista);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Saldo atual: " + this.saldo);
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

/*
 * 2. Crie uma classe referente à uma conta bancária, que possui como atributos
 * o seu número, saldo e o nome do correntista.
 * 
 * Crie também o método saque() que serve para retirar o certo valor do saldo, o
 * método depósito() que serve para adiconar um valor ao saldo e o método
 * extrato() que serve para mostrar na tela o nome do correntista, o número da
 * conta e o saldo. Crie um programa principal e demonstre a utilização dos
 * métodos implementados.
 */