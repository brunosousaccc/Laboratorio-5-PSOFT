package entities;

import strategy.EstrategiaDeCalculo;

public class Pedestre implements EstrategiaDeCalculo{

	
	
	@Override
	public void CalculoRota() {
		System.out.println("Calculando a rota de Pedestre…");
	}


	
	
}
