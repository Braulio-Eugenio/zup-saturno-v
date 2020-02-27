package revisao.orientacao.a.objeto.aula11;

public class ProgramaTelevisao {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();

		for (int i = 0; i < 15; i++) {
			controle.aumentarVolume();
		}

		for (int i = 0; i < 1400 ; i++) {
			controle.aumentaCanal();
		}
		for (int i = 0; i < 0; i++) {
			controle.diminuiCanal();
		}
		for (int i = 0; i < 5; i++) {
			controle.diminuirVolume();
		}
		System.out.println("Canal : " + controle.consultaCanal());
		System.out.println("Volume : " + controle.consultaVolume());
	}

}
