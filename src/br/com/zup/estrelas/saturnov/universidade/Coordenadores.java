package br.com.zup.estrelas.saturnov.universidade;

public class Coordenadores extends Funcionario {
	public int[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void setProfessoresSupervisionados(int[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}

	private int[] professoresSupervisionados = new int[10];

}
