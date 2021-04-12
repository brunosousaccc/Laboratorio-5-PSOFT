package exe;

import java.util.Scanner;

import entities.Carro;
import entities.Metro;
import entities.Onibus;
import entities.Pedestre;
import entities.Transporte;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int esc;
		
		Pedestre pedestre = new Pedestre();
		Carro carro = new Carro();
		Onibus onibus = new Onibus();
		Metro metro = new Metro();
		
		Transporte meioDeTransporte = new Transporte();
		
		
		System.out.println("Escolha o meio de transporte:\n");
		do{
			System.out.println("1 - Metro");
			System.out.println("2 - Onibus");
			System.out.println("3 - Carro");
			System.out.println("4 - Pedestre");
			esc = sc.nextInt();
			
			switch (esc){
				case 1:
					meioDeTransporte.calculoRotaStrategy(metro);
					break;
				case 2:
					meioDeTransporte.calculoRotaStrategy(onibus);
					break;
				case 3:
					meioDeTransporte.calculoRotaStrategy(carro);
					break;
				case 4:
					meioDeTransporte.calculoRotaStrategy(pedestre);
					break;
			}
			
			System.out.println("\nSe deseja mudar o meio de transporte, escolha o numero");
			
		}while (true);
		
	}

}
