package revisao.orientacao.a.objeto;

public class ProgramaPrincipalContaCorrente {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Bráulio", "30012-9", 10000);
		conta.saque(15);
		conta.deposito(2000);
		conta.extrato();
	}

}
