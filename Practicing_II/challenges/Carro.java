package questao01;

public class Carro extends Veiculo{

	private long chassi;
	
	TelaPrincipal obj=new TelaPrincipal();
	
	public Carro(String placa, String cor, long chassi) {
		super(placa, cor);
		this.chassi = 0;
	}



	public long getChassi() {
		return chassi;
	}

	public void setChassi(long chassi) {
		this.chassi = chassi;
	}


	//public String todosDados(String e) {

//}

	
	

}