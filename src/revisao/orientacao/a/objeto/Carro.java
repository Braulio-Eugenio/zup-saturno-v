package revisao.orientacao.a.objeto;

public class Carro {
	private String nome;
	private String fabricante;
	private String cor;
	private double peso;
	private double valor;

	public Carro(String nome, String fabricante, String cor, double peso, double valor) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.cor = cor;
		this.peso = peso;
		this.valor = valor;

	}

	public void darDesconto(double valorComDesconto) {
		this.valor -= valorComDesconto;

	}

	public void pintar(String novaCor) {
		this.cor = novaCor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

/*
 * 1. Crie uma classe que represente um carro, que tenha como caracter�sticas o
 * nome, o peso, a fabricante, a cor e o valor do carro.
 * 
 * 
 * Crie tamb�m o m�todo darDesconto() que servir� para diminuir o pre�o do carro
 * e
 * 
 * o m�todo pintar(), que ser� respons�vel por mudar a cor do carro.
 * 
 * Crie um carro no seu programa principal, utilize os m�todos criados e mostre
 * na tela o pre�o e a cor do carro antes e depois da utiliza��o dos m�todos.
 */