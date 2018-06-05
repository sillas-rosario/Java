package poli;

public class Dog extends Mamifero{
	
	
	
	@Override
	public void Locomover() {
		System.out.println(" Correr ");
	}
	@Override
	public void EmitirSom() {
		System.out.println(" Latir ");
	}
	
	
	
	public void reagir(String r){
		System.out.println(" abanar ");
		
	}
	public void reagir(int hora){
		System.out.println(" deitar ");
		
	}
	public void reagir(boolean dono){
		
		System.out.println(" Rosnar ou latir ");
	}
	public void reagir(int idade, int peso){
		System.out.println(" rolar ");
		
		
	}
	 

}
