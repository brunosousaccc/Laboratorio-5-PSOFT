package entities;

import strategy.EstrategiaDeCalculo;

public class Transporte {
	
	private double distancia;
	private double tempoFinal;
	private EstrategiaDeCalculo estrategia;
	

	public Transporte(double distancia, EstrategiaDeCalculo estrategia) {
		super();
		this.distancia = distancia;
		this.estrategia = estrategia;
	}

	public void calculoRotaStrategy() {
		this.tempoFinal = estrategia.CalculoRota(this.distancia);
		
	}
	
	public void trocaDoMeioDeTransporte(EstrategiaDeCalculo novaEstrategia) {
		this.estrategia = novaEstrategia;
		
	}	

	public double getDistancia() {
		return distancia;
	}



	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}



	public double getTempoFinal() {
		return tempoFinal;
	}



	public void setTempoFinal(double tempoFinal) {
		this.tempoFinal = tempoFinal;
	}



	public EstrategiaDeCalculo getEstrategia() {
		return estrategia;
	}



	public void setEstrategia(EstrategiaDeCalculo estrategia) {
		this.estrategia = estrategia;
	}



	@Override
	public String toString() {
		return "Distancia:" + distancia + "\nTempoFinal: " + tempoFinal + "\nEstrategia: " + estrategia;
	}
}
