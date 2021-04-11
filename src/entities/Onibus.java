package entities;

import strategy.EstrategiaDeCalculo;

public class Onibus implements EstrategiaDeCalculo{

	private final double disOnibus = 32.0;

	
	@Override
	public double CalculoRota(double metros) {
		return metros * disOnibus;
	}

	@Override
	public String toString() {
		return "Onibus\n";
	}
	
	

	
	
	
}
