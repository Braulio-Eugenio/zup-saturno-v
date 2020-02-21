package br.com.zup.estrelas.saturnov.exercicio.aula10;

public class CartaoDeCredito {
	private double limite;
	private double saldoDaFatura;
	private String nomeCliente;

	public CartaoDeCredito(double limite, String nomeCliente) {
		this.limite = limite;
		this.nomeCliente = nomeCliente;
		this.saldoDaFatura = 0;

	}

	public void aumentaLimite(double limiteAumentado) {
		this.limite += limiteAumentado;

	}

	public void diminuiLimite(double limiteDiminuido) {
		this.limite -= limiteDiminuido;

	}

	public void realizaCompra(double compra) {
		if (this.limite >= compra) {
			this.saldoDaFatura += compra;
			this.limite -= compra;
			System.out.println("COMPRA APROVADA");

		} else {
			System.out.println("COMPRA REPROVADA");
		}
	}

	public void imprimeFatura() {
		System.out.printf("O limite atual de compra é de: %.2f\n", limite);
		System.out.printf("A sua fatura para o dia 10/03/2020 é de: %.2f ", saldoDaFatura);
	}

	public double getLimite() {

		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldoDaFatura() {
		return saldoDaFatura;
	}

	public void setSaldoDaFatura(double saldoDaFatura) {
		this.saldoDaFatura = saldoDaFatura;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
//4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos o seu limite, o
//saldo da fatura e nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(),
//realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido e o
//imprimeFatura() que imprime na tela o valor da fatura.