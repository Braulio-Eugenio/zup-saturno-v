package br.com.zup.estrelas.saturnov.calculo.area;

public class Circulo extends FiguraGeometrica {
	private double raio;
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double calculoArea() {
		
		return  (Math.pow(raio, 2)* Math.PI);
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

}
