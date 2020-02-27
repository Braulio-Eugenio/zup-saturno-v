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
			System.out.println("Capacidade máxima atingida.");
		}
	}

	public void sai() {
		if (this.qtdPessoas > 0) {
			this.qtdPessoas = -1;

		}
	}

	public void sobe() {
		if (this.andarAtual == totalAandar) {
			System.out.println("Não é possivel subir você esta no último andar");
		} else {
			this.andarAtual +=  1;
		}
	}
	public void desce () {
		if(andarAtual == 0) {
			System.out.println("Você esta no térreo por favor escolha um andar");
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
 * 3. Crie uma classe denominada Elevador para armazenar as informações de um
 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
 * elevador e quantas pessoas estão presentes nele.
 * 
 * 
 * A classe deve também disponibilizar os seguintes métodos: Entra : para
 * acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
 * espaço); Sai : para remover uma pessoa do elevador (só deve remover se houver
 * alguém dentro dele); Sobe : para subir um andar (não deve subir se já estiver
 * no último andar); Desce : para descer um andar (não deve descer se já estiver
 * no térreo);
 */