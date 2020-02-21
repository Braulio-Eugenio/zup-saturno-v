package br.com.zup.estrelas.saturnov.universidade;

public class Professor extends Funcionario {
	public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
		super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

	}

	private String nivelGraduacao;
	private String diciplinaMinistrada;
	private int qtdAlunos;
	private int qtdTurmas;

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
