package entities;

import strategy.EstrategiaDeCalculo;

public class Carro implements EstrategiaDeCalculo{
	
	@Override
	public void CalculoRota() {
		System.out.println("Calculando a rota de Carro…");
	}

	
	
	
	

}
