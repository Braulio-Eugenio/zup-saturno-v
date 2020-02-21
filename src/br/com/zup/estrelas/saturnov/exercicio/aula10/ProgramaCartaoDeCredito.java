package br.com.zup.estrelas.saturnov.exercicio.aula10;

public class ProgramaCartaoDeCredito {

	public static void main(String[] args) {
		CartaoDeCredito cartao = new CartaoDeCredito(1000,  "Jorge Nustacio Sideribelo") ;
		
		cartao.aumentaLimite(0);
		cartao.diminuiLimite(0);
		
		
		System.out.println("Titular do cartão: " + cartao.getNomeCliente());	
		System.out.println("O limite total do seu cartão é: " + cartao.getLimite());
		
		
		cartao.realizaCompra(540);
		cartao.imprimeFatura();
	}

}
//4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos o seu limite, o
//saldo da fatura e nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(),
//realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido e o
//imprimeFatura() que imprime na tela o valor da fatura.