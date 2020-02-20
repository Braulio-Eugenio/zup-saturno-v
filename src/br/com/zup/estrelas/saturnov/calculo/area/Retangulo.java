package br.com.zup.estrelas.saturnov.calculo.area;

public class Retangulo extends FiguraGeometrica {
	private double altura;
	private double base;

	

	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
		
		
	}

	@Override
	public double calculoArea() {
		
		return this.base * this.altura;
	}


	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}




}
