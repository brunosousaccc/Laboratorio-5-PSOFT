package entities;

import strategy.EstrategiaDeCalculo;

public class Transporte {
	

	private EstrategiaDeCalculo estrategia;
	
	
	
	public void calculoRotaStrategy(EstrategiaDeCalculo novaEstrategia) {
		trocaDoMeioDeTransporte(novaEstrategia);
		estrategia.CalculoRota();
		
	}
	
	public void trocaDoMeioDeTransporte(EstrategiaDeCalculo novaEstrategia) {
		this.estrategia = novaEstrategia;
		
	
	

	}	

}