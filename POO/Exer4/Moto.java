package Exer4;


public class Moto extends PlacaeCor
{
	int cilindradas;
	
	public Moto()
	{
		cilindradas=0;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	public String todososDados()
	{
		
		String saida="";
		saida = "\n A placa da moto é: "+ getPlaca() +"\n A cor da moto é: " + getCor() + "\n A moto possui: "+ getCilindradas() + " cilindradas";
		return saida;
	}

}
