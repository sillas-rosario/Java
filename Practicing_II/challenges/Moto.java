package questao01;

public class Moto extends Veiculo{
	private int cilindradas;
	

	public Moto(String placa, String cor, int cilindradas) {
		super(placa, cor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String todosDados(String e) {
		// TODO Auto-generated method stub
		return super.todosDados(e);
	}
	
}
