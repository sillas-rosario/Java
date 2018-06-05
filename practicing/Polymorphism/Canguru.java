package poli;

public class Canguru extends Mamifero{
	
	private String UsarBolsa;
	
	@Override
	public void Locomover(){
		System.out.println(" PULANDO   ");
	}
	

	@Override
	public void EmitirSom() {
		System.out.println(" Som de canguru ");
	}


	
	
	

	public void setUsarBolsa(String usarBolsa) {
		
		UsarBolsa = usarBolsa;
	}
	
	public String getUsarBolsa() {
		
		return UsarBolsa;
	}
	
}
