package Exer4;


public class Carro extends PlacaeCor
{
	
	long chassi;



public Carro()
{
	
	chassi=0;
	
}

public long getChassi() 
{
	return chassi;
}

public void setChassi(long chassi) 
{
	this.chassi = chassi;
}

public String todososDados()
{
	
		String saida="";
		saida = "\nA placa do carro � : "+ getPlaca()+"\n A cor do carro �: "+ getCor() +"\nO chassi do carro � :" + getChassi();
		return saida;
}
}