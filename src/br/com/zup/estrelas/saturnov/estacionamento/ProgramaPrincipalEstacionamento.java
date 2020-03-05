package br.com.zup.estrelas.saturnov.estacionamento;

import java.util.Scanner;

public class ProgramaPrincipalEstacionamento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Estacionamento estacionamento = new Estacionamento(0, 3);

		String opcao = "";

		do {
			System.out.println("Menu");
			System.out.println("[1] Para dar entrada em um carro.");
			System.out.println("[2] Para dar saida em um carro.");
			System.out.println("[3] Para imprimir o saldo.");
			System.out.println("[4] Para alterar a capacidade.");
			System.out.println("[5] Para encontrar um carro.");
			System.out.println("[0] Para sair.");
			opcao = teclado.next();
			switch (opcao) {
			case "1":
				// dar entrada no carro.
				Carro carro = new Carro();
				System.out.println("Digite a placa do ve�culo:");
				carro.setPlaca(teclado.next());
				System.out.println("Digite a cor do carro:");
				carro.setCor(teclado.next());
				System.out.println("Digite a marca do carro:");
				carro.setMarca(teclado.next());
				System.out.println("Digite o modelo do carro:");
				carro.setModelo(teclado.next());
				estacionamento.registraEntrada(carro);

				continue;

			case "2":
				// dar saida no carro.
				System.out.println("Digite a placa do ve�culo:");
				String placaCarro = teclado.next();
				System.out.println("Digite o valor:");
				Double valorAserPago = teclado.nextDouble();
				estacionamento.registraSaida(placaCarro, valorAserPago);
				break;

			case "3":
				// imprimir saldo.
				estacionamento.imprimeSaldo();
				break;

			case "4":
				// para alterar a capacidade do estacionamento.
				System.out.println("Qual a capacidade do estacionamento?");
				int novaCapacidade = teclado.nextInt();
				estacionamento.aumentaCapacidade(novaCapacidade);
				break;

			case "5":
				// encrontrar um carro.
				System.out.println("Digite a placa do ve�culo para encontrar o ve�culo:");
				String buscaVeiculo = teclado.next();
				estacionamento.carroPresente(buscaVeiculo);

				break;

			case "0":
				// para sair

				break;

			default:
				System.out.println("Op��o invadida!");

			}
		} while (opcao == "0");

		teclado.close();
	}
}
/*
 * 6. Crie um programa principal com um menu pelo qual o usu�rio seja capaz de
 * controlar entradas (na entrada voc� deve perguntar ao usu�rio os dados do
 * carro para criar o seu objeto do tipo carro) e sa�das do seu estacionamento,
 * imprimir o saldo e alterar a capacidade m�xima do estacionamento.
 */