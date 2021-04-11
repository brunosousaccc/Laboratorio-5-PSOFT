package entities;

import strategy.EstrategiaDeCalculo;

public class Pedestre implements EstrategiaDeCalculo{

	private final double disPedestre = 45.0;
	
	
	@Override
	public double CalculoRota(double metros) {
		return metros * disPedestre;
	}

	@Override
	public String toString() {
		return "Pedestre\n";
	}

	
	
}
