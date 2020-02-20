package br.com.zup.estrelas.saturnov.calculo.area;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Triangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;

	}

	@Override
	public double calculoArea() {

		return ((this.altura * this.base) / 2);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
