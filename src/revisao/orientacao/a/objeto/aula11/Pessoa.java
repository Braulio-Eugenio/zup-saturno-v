package revisao.orientacao.a.objeto.aula11;

public class Pessoa {
	private String nome;
	private double dataDeNascimento;
	private double altura;
	private double idade;

	public Pessoa(String nome, double dataDeNascimento, double altura) {

		this.altura = altura;
		this.dataDeNascimento = dataDeNascimento;
		this.nome = nome;
		

	}

	public void dados() {
		System.out.println("Nome :" + this.nome);
		System.out.printf("Idade :%.0f\n", this.idade);
		System.out.println("Altura :" + this.altura);
		System.out.printf("Ano de nascimento :%.0f\n", this.dataDeNascimento);
	}

	public void calcularIdade(double anoAtual) {
		this.idade = anoAtual - this.dataDeNascimento;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(double dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
/*
 * 3. Crie uma classe para representar uma pessoa, com os atributos privados de
 * nome, data de nascimento e altura. Crie os métodos públicos necessários para
 * sets e gets e também um método para imprimir todos dados de uma pessoa. Crie
 * um método para calcular a idade da pessoa.
 */