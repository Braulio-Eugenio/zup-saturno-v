package br.com.zup.estrelas.saturnov.universidade;

public class Professor extends Funcionario {
	private String nivelGraduacao;
	private String diciplinaMinistrada;
	private int qtdAlunos;
	private int qtdTurmas;
	
	
	public String getNivelGraduacao() {
		return nivelGraduacao;
	}
	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}
	public String getDiciplinaMinistrada() {
		return diciplinaMinistrada;
	}
	public void setDiciplinaMinistrada(String diciplinaMinistrada) {
		this.diciplinaMinistrada = diciplinaMinistrada;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public int getQtdTurmas() {
		return qtdTurmas;
	}
	public void setQtdTurmas(int qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
	}
	
	
	

}