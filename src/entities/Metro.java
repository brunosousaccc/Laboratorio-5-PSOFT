package entities;

import strategy.EstrategiaDeCalculo;

public class Metro implements EstrategiaDeCalculo {
	
		
	@Override
	public void CalculoRota() {
		System.out.println("Calculando a rota de Metro…");;
	}



	
	
}
