package questao01;

import java.util.ArrayList;
import java.util.LinkedList;

abstract class Veiculo {
	
	private String placa,cor;
    public ArrayList<String> lista= new ArrayList<String>();
	
	public Veiculo(String placa, String cor) {
		this.placa = " ";
		this.cor = " ";
		
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

	public String todosDados(String nome){
		
		return  nome;
		
	}
	
}
