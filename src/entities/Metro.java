package entities;

import strategy.EstrategiaDeCalculo;

public class Metro implements EstrategiaDeCalculo {

	private final double DISMETRO = 17.0;
	
	
	
	@Override
	public double CalculoRota(double metros) {
		return metros * DISMETRO;
	}

	@Override
	public String toString() {
		return "Metro\n";
	}

	
	
}
