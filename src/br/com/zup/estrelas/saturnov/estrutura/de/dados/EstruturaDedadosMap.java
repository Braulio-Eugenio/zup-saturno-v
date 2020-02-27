package br.com.zup.estrelas.saturnov.estrutura.de.dados;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstruturaDedadosMap {
	public static void main(String[] args) {
		Map<String, String> estruturaMap = new HashMap<String, String>();
		Scanner teclado = new Scanner(System.in);
		String nome;
		String cpf;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite " + (i + 1) + "º nome :");
			nome = teclado.nextLine();
			System.out.println("Digite o cpf :");
			cpf = teclado.nextLine();
			estruturaMap.put(cpf, nome);

		}
		for (String mostrarNome : estruturaMap.values()) {
			System.out.println(mostrarNome);

		}
		System.out.println("Par remover um usuario digite um cpf :");
		cpf = teclado.nextLine();
		estruturaMap.remove(cpf);
		System.out.println("USUARIO REMOVIDO.\nOs usuario atuais são: ");
		for (String mostrarNome : estruturaMap.values()) {
			System.out.println(mostrarNome);
		}

		teclado.close();
	}
}
/*
 * 2. Escreva um programa para criar um HashMap onde a chave é o CPF e o valor o
 * Nome. Leia do usuário 10 conjuntos de valores e armazene em seu Hashmap
 * Mostre na tela os 10 valores de nomes armazenados Peça ao usuário um CPF e
 * remova do seu hashMap a entrada referente à esse valor Mostre na tela os
 * valores restantes em seu hashMap
 */