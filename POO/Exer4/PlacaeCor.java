package Exer4;

public class PlacaeCor 
{
	
	String placa;
	String cor;
	
	public PlacaeCor()
	{
		placa="";
		cor="";
	}
	
	
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String todososDados()
	{
		String saida="";
		saida += "\n Placa do carro:"+ getPlaca() + "\n Cor do carro:" + getCor();
		return saida;
	}
}
