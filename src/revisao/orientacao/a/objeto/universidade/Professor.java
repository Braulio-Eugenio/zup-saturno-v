package revisao.orientacao.a.objeto.universidade;

public class Professor extends Funcionario {
	private String nivelGraduacao;
	private String diciplinaMinistrada;
	private int qtdAluno;
	private int qtdturmas;

	public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario,
			String nivelGraduacao, String diciplinaMinistrada, int qtdAluno, int qtdturmas) {
		super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.diciplinaMinistrada = diciplinaMinistrada;
		this.qtdAluno = qtdAluno;
		this.qtdturmas = qtdturmas;
	}
	@Override
	public void aumentoSalario() {
		// TODO Auto-generated method stub
		super.aumentoSalario();
	}
	
	public int adcionaTurma() {
		this.qtdturmas += 1;
		return this.qtdturmas;
		
	}
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
	public int getQtdAluno() {
		return qtdAluno;
	}
	public void setQtdAluno(int qtdAluno) {
		this.qtdAluno = qtdAluno;
	}
	public int getQtdturmas() {
		return qtdturmas;
	}
	public void setQtdturmas(int qtdturmas) {
		this.qtdturmas = qtdturmas;
	}
	

}
