package revisao.orientacao.a.objeto;

public class ProgramaPrincipalCarro {

	public static void main(String[] args) {
		Carro carro = new Carro("Gol", "Volkswagen", "Preto", 2500, 38500);

		System.out.println("Carro modelo: " + carro.getNome());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Fabricante: " + carro.getFabricante());
		System.out.printf("Peso do veículo: %.0fKg\n", carro.getPeso());
		System.out.printf("Valor financiado: %.3f\n", carro.getValor());

		carro.darDesconto(5000);
		System.out.println("Valor à vista:" + carro.getValor());
		carro.pintar("Prata");
		System.out.print("Nova cor:" + carro.getCor());
	}

}
/*
 * Crie um carro no seu programa principal, utilize os métodos criados e mostre
 * na tela o preço e a cor do carro antes e depois da utilização dos métodos.
 */