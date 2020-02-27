package revisao.orientacao.a.objeto;

public class CartaoDeCredito {
	private String nomeCliente;
	private double limite;
	private double saldoFatura;

	public CartaoDeCredito(String nomeCliente, double limite) {

		this.nomeCliente = nomeCliente;
		this.limite = limite;
		
	}

	public void aumentaLimite(double aumentoDolimite) {
		this.limite += aumentoDolimite;
	}

	public void diminuiLimite(double limiteReduzido) {
		this.limite -= limiteReduzido;
	}

	public void realizaCompra(double compra) {
		if (this.limite >= compra) {
			this.limite -= compra;
			this.saldoFatura += compra;
			System.out.println("COMPRA APROVADA");
		} else {
			System.out.println("COMPRA REPROVADA");
		}
	}
	public void imprimeFatura () {
		
		System.out.println("O total de sua fatura é: "+ saldoFatura);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldoFatura() {
		return saldoFatura;
	}

	public void setSaldoFatura(double saldoFatura) {
		this.saldoFatura = saldoFatura;
	}
}
/*
 * 4. Crie uma classe que represente um cartão de crédito, que deve ter como
 * atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os
 * métodos aumentaLimite(), diminuiLimite(), realizaCompra() que não deve
 * permitir uma compra caso o limite tenha sido atingido e o imprimeFatura() que
 * imprime na tela o valor da fatura.
 */