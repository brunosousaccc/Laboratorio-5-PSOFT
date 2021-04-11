package entities;

import strategy.EstrategiaDeCalculo;

public class Carro implements EstrategiaDeCalculo{

	private final double disCarro = 20.0;

	
	@Override
	public double CalculoRota(double metros) {
		return metros * disCarro;
	}

	@Override
	public String toString() {
		return "Carro\n";
	}

	
	
	

}
