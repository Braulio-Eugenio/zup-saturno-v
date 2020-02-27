package revisao.orientacao.a.objeto;

public class Elevador {
	private int andarAtual;
	private int totalAandar;
	private int capacidade;
	private int qtdPessoas;

	public Elevador(int andarAtual, int totalAandar, int capacidade, int qtdPessoas) {
		this.andarAtual = andarAtual;
		this.totalAandar = totalAandar;
		this.capacidade = capacidade;
		this.qtdPessoas = qtdPessoas;
	}

	public void entra() {
		if (this.qtdPessoas > this.capacidade) {
			this.qtdPessoas = +1;
		} else {
			System.out.println("Capacidade m�xima atingida.");
		}
	}

	public void sai() {
		if (this.qtdPessoas > 0) {
			this.qtdPessoas = -1;

		}
	}

	public void sobe() {
		if (this.andarAtual == totalAandar) {
			System.out.println("N�o � possivel subir voc� esta no �ltimo andar");
		} else {
			this.andarAtual +=  1;
		}
	}
	public void desce () {
		if(andarAtual == 0) {
			System.out.println("Voc� esta no t�rreo por favor escolha um andar");
		} else {
			this.andarAtual -=  1;
		}
		
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAandar() {
		return totalAandar;
	}

	public void setTotalAandar(int totalAandar) {
		this.totalAandar = totalAandar;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

}
/*
 * 3. Crie uma classe denominada Elevador para armazenar as informa��es de um
 * elevador dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo =
 * 0), total de andares no pr�dio (desconsiderando o t�rreo), capacidade do
 * elevador e quantas pessoas est�o presentes nele.
 * 
 * 
 * A classe deve tamb�m disponibilizar os seguintes m�todos: Entra : para
 * acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver
 * espa�o); Sai : para remover uma pessoa do elevador (s� deve remover se houver
 * algu�m dentro dele); Sobe : para subir um andar (n�o deve subir se j� estiver
 * no �ltimo andar); Desce : para descer um andar (n�o deve descer se j� estiver
 * no t�rreo);
 */