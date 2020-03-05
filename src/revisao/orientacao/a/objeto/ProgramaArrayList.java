package revisao.orientacao.a.objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		String corDigitada = "";
		while (!corDigitada.equals("preto")) {
			System.out.println("Digite a cor");
			corDigitada = teclado.nextLine();
			cores.add(corDigitada);
		}
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
//1. Escreva um programa em Java que crie um ArrayList e peça pro usuario digitar as cores até
//quando ele digitar preto, por fim as imprima na tela.