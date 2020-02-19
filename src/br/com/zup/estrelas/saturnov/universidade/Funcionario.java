package br.com.zup.estrelas.saturnov.universidade;

public class Funcionario {

	private String nome;
	private String cpf;
	private String numeroDeRegistro;
	private String orgaoDeLotacao;
	private double salario;

	public Funcionario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.numeroDeRegistro = numeroDeRegistro;
		this.orgaoDeLotacao = orgaoDeLotacao;
		this.salario = salario;
	}

	public void aumentoDeSalario() {
		this.salario += salario * 0.10;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	public void setNumeroDeRegistro(String numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

	public String getOrgaoDeLotacao() {
		return orgaoDeLotacao;
	}

	public void setOrgaoDeLotacao(String orgaoDeLotacao) {
		this.orgaoDeLotacao = orgaoDeLotacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {

		this.salario = salario;
	}

}