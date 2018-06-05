package Candidato;

//Matricula 134400042

public class Deputado_Federal extends Candidato{

public Deputado_Federal(String nome, String partido, long numvotos) {
		super(nome, partido, numvotos);
		// TODO Auto-generated constructor stub
	}

//	matricula 134 40004 2
// verificar a logica do limite
	
	
	public int limite_superior=4000;
	public int numero;
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		
		if((numero>=1000)&&(numero<4000)){
			
			this.numero=numero;
		}
		else{
			
			this.numero = limite_superior;
			limite_superior --;
		}
	}

	
	
	
	 
	public String Resultado(){
		return "Candidato: "+getNome()+"\nNumero: "+getNumero()+"\nN° de Votos: "+getNumvotos();
	}
	
	
}
