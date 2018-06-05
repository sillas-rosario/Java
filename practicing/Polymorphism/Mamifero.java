package poli;

public class Mamifero extends Animal{
	
	private String corPelo;
	

	public void Locomover() {
		// TODO Auto-generated method stub
		System.out.println(" andando ");
		
	}

	public void Alimentar() {
		// TODO Auto-generated method stub
		System.out.println(" leite ");
	}

	public void EmitirSom() {
		// TODO Auto-generated method stub
		System.out.println(" som de mamifero ");
		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

}
