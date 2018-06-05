package Exer4;


public class Caminhao extends PlacaeCor {
	
	int num_eixos;
	double carga;
	
	public Caminhao()
	{
		num_eixos=0;
		carga=0;
	}

	public int getNum_eixos() {
		return num_eixos;
	}

	public void setNum_eixos(int num_eixos) {
		this.num_eixos = num_eixos;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public String todososDados(){
		
		String saida="";
		saida = "\n A placa do caminhão é: " + getPlaca() + "\n A cor do caminhao é: " + getCor() + "\n O numero de eixos é: "+ getNum_eixos() + " e a carga é de: " + getCarga() + " mil quilos.";
		return saida;
	}
	

}
