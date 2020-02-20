package br.com.zup.estrelas.saturnov.calculo.area;

public class ProgramaCalculo {

	public static void main(String[] args) {

		FiguraGeometrica quadrado = new Quadrado(85);
		FiguraGeometrica retangulo = new Retangulo(10, 15);
		FiguraGeometrica circulo = new Circulo(15);
		FiguraGeometrica triangulo = new Triangulo(10, 15);

		System.out.println("A área do quadrado é: " + quadrado.calculoArea());
		System.out.println("A área do retangulo é: " + retangulo.calculoArea());
		System.out.println("A área do círculo é: " + circulo.calculoArea());
		System.out.println("A área do triangulo é: " + triangulo.calculoArea());

	}

}
