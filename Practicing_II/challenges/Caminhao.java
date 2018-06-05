package questao01;

public class Caminhao extends Veiculo {
    
	private int NumeroEixo;
	private double carga;
	

	public Caminhao(String placa, String cor, int numeroEixo, double carga) {
		super(placa, cor);
		NumeroEixo = numeroEixo;
		this.carga = carga;
		
		
	}
	public int getNumeroEixo() {
		return NumeroEixo;
	}
	public void setNumeroEixo(int numeroEixo) {
		NumeroEixo = numeroEixo;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
	@Override
	public String todosDados(String e) {
		// TODO Auto-generated method stub
		return super.todosDados(e);
	}
	
	
	
	
	
	
}
