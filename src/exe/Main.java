package exe;

import entities.Carro;
import entities.Metro;
import entities.Onibus;
import entities.Pedestre;
import entities.Transporte;

public class Main {

	public static void main(String[] args) {
		Pedestre pedestre = new Pedestre();
		Carro carro = new Carro();
		Onibus onibus = new Onibus();
		Metro metro = new Metro();
		
		Transporte meioDeTransporte = new Transporte(20.0, metro);
		meioDeTransporte.calculoRotaStrategy();
		System.out.println(meioDeTransporte.toString());
		
		meioDeTransporte.trocaDoMeioDeTransporte(onibus);
		System.out.println(meioDeTransporte.toString());
		
		
		meioDeTransporte.trocaDoMeioDeTransporte(carro);
		System.out.println(meioDeTransporte.toString());
		
		meioDeTransporte.trocaDoMeioDeTransporte(pedestre);
		System.out.println(meioDeTransporte.toString());

	}

}
