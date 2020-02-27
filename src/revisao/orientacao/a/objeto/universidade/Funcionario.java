package revisao.orientacao.a.objeto.universidade;

public class Funcionario {
	private String nome;
	private String cpf;
	private String numeroDeRegistro;
	private String orgaoDeLotacao;
	private double salario;
	
	public Funcionario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.numeroDeRegistro = numeroDeRegistro;
		this.orgaoDeLotacao = orgaoDeLotacao;
		this.salario = salario;
	}
	
	public void aumentoSalario() {
		this.salario = (salario * 0.1);
		
		
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
/* 
1. Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores,
coordenadores, e funcion�rios administrativos.
Os atributos comuns de todos os funcionarios ser�o: Nome, CPF, n�mero de registro, �rg�o
de lota��o e sal�rio.
Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada e
quantidade de alunos e quantidade de turmas.
Os coordenadores possuem os atributos: professoresSupervisionados[10].
Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e senioridade.
Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos:

Aumento de sal�rio: para todos menos os coordenadores aumenta o sal�rio em 10% e para
os coordenadores o aumento � de 5%.
Adiciona turma para os professores.
Adiciona professor (para os coordenadores): observe que um coordenador s� pode
coordenar 10 professores.
*/