package br.com.zup.estrelas.saturnov.universidade;

public class Coordenador extends Funcionario {
	private int professoresSupervisionados;
	
	public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
		super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
		
	}


	
		

	

	public int getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void setProfessoresSupervisionados(int professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}

}
