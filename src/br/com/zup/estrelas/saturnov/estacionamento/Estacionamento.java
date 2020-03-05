package br.com.zup.estrelas.saturnov.estacionamento;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {

	private double valorEmCaixa;
	private int capacidadeMaxima;
	private Map<String, Carro> carros;

	public Estacionamento(double valorEmCaixa, int capacidadeMaxima) {
		this.carros = new HashMap<String, Carro>();
		this.valorEmCaixa = valorEmCaixa;
		this.capacidadeMaxima = capacidadeMaxima;

	}

	public void aumentaCapacidade(int novaCapacidade) {
		this.capacidadeMaxima += novaCapacidade;
		System.out.println("O estacionamento atual comtém: " + novaCapacidade + " vagas");
	}

	public void registraEntrada(Carro carro) {
		if (carros.size() < capacidadeMaxima) {
			this.carros.put(carro.getPlaca(), carro);
			System.out.println("Entrada registrada.");
		} else {
			System.out.println("Não é possivel entrar estacionamento lotado!");
		}

	}

	public void registraSaida(String placa, Double valorEstadia) {
		if (carros.get(placa) != null) {
			this.valorEmCaixa += valorEstadia;
			this.carros.remove(placa);
			System.out.println("Saida registrada.");
		} else {
			System.out.println("Carro não encontrado.");
		}
	}

	public void imprimeSaldo() {
		System.out.println("O seu saldo é:" + this.valorEmCaixa);
	}

	public void carroPresente(String placa) {

		if (carros.get(placa) != null) {

			System.out.println("Carro encontrado.");

		} else {
			System.out.println("Carro não encontrado.");

		}

	}

	public double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public void setValorEmCaixa(double valorEmCaixa) {
		this.valorEmCaixa = valorEmCaixa;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
}

/*
 * 5. Modele a classe Estacionamento com os atributos valorEmCaixa
 * capacidadeMaxima Crie um map para armazenar os carros dentro do
 * estacionamento onde a chave é a placa e o valor é um objeto do tipo Carro. os
 * métodos registraEntrada(carro) - adiciona um carro no estacionamento
 * registraSaida(placa, valorEstadia) - remove um carro do estacionamento e
 * registrando o valor da estadia. imprimeSaldo() - mostra na tela do valor em
 * caixa carroPresente(placa) - mostra na tela se um carro está dentro do
 * estacionamento
 */