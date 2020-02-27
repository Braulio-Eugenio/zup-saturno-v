package br.com.zup.estrelas.saturnov.estrutura.de.dados;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
	private double ValorEmCaixa;
	private int capacidadeMaxima;
	
	
	public Estacionamento(double valorEmCaixa, int capacidadeMaxima, Map<String, Carro> estacionamentoMap) {
		
		this.ValorEmCaixa = valorEmCaixa;
		this.capacidadeMaxima = capacidadeMaxima;
		this.estacionamentoMap = estacionamentoMap;
	}

	Map<String, Carro> estacionamentoMap = new HashMap<String, Carro>();
	
	
	public boolean registraEntrada(Carro carro) {
		if(this.capacidadeMaxima < capacidadeMaxima) {
			
		}
		return false;
	}
	

	public double getValorEmCaixa() {
		return ValorEmCaixa;
	}

	public void setValorEmCaixa(double valorEmCaixa) {
		ValorEmCaixa = valorEmCaixa;
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