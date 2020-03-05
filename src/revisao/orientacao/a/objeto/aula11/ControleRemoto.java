package revisao.orientacao.a.objeto.aula11;

public class ControleRemoto {
	private Televisao televisao;

	public ControleRemoto() {
		this.televisao = new Televisao();

	}

	public Televisao getTelevisao() {
		return televisao;
	}

	public int aumentarVolume() {
		int novoVolume = this.televisao.getVolume() + 1;
		if (novoVolume < 100) {
			this.televisao.setVolume(novoVolume);

		}
		return novoVolume;
	}

	public int diminuirVolume() {
		int novoVolume = this.televisao.getVolume() - 1;
		if (novoVolume >= 0) {
			this.televisao.setVolume(novoVolume);
		}
		return 0;
	}

	public int aumentaCanal() {
		int novoCanal = this.televisao.getCanal() + 1;
		if (novoCanal <= 1500) {
			this.televisao.setCanal(novoCanal);

		
		}
		return novoCanal;
		
	}

	public int diminuiCanal() {
		int novoCanal = this.televisao.getCanal() - 1;
		if (novoCanal > 0) {
			this.televisao.setCanal(novoCanal);
		}
		return novoCanal;
	}

	public int canalDireto(int novoCanal) {
		novoCanal = televisao.getCanal() + novoCanal;
		return novoCanal;
	}

	public int consultaVolume() {
		return this.televisao.getVolume();
	}

	public int consultaCanal() {
		return this.televisao.getCanal();
	}
	
}

/*
 * 4. Crie uma classe Televisao
 *  e uma classe ControleRemoto que pode controlar o
 * volume e trocar os canais da televisão. O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade trocar para um canal
 * indicado; consultar o valor do volume de som e o canal selecionado Crie
 * depois um programa principal que interaja com as suas classes, não se esqueça
 * dos modificadores de acesso e dos getters e setters em suas classes.
 */
