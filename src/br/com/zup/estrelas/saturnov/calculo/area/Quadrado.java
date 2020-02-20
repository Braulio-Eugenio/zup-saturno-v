package br.com.zup.estrelas.saturnov.calculo.area;

public class Quadrado extends FiguraGeometrica {
	private double lado;
	
	
	public Quadrado(double lado) {
		this.lado = lado;

	}
	
	@Override
	public double calculoArea() {
		
		return this.lado * this.lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	
	}


}
