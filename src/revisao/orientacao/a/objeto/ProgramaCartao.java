package revisao.orientacao.a.objeto;

public class ProgramaCartao {
	public static void main(String[] args) {
		CartaoDeCredito cartao = new CartaoDeCredito("Braulio eugenio", 5000);
		System.out.println(cartao.getNomeCliente());
		
		cartao.aumentaLimite(0);
		cartao.diminuiLimite(0);
		cartao.realizaCompra(5000);
		cartao.imprimeFatura();

	}
}
