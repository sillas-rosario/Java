package Candidato;

public class Presidente extends Candidato{
	
//	matricula 134400042
// verificar a logica do limite

	public Presidente(String nome, String partido, long numvotos) {
		super(nome, partido, numvotos);
		// TODO Auto-generated constructor stub
	}
	
	public static int limite=22;
	public int numero;
	
	public int getNumero(){
		
		return numero;
	}
	
	public void setNumero (int numero){
		
		if((numero>=10)&&(numero<=99)){
			
		this.numero=numero;
		
		}
		else{
			
		this.numero=limite;
		limite++;
		
		}
	}
	
	public String Resultado()
	{
		return "Candidato: "+getNome()+"\nNumero: "+getNumero()+"\nN° de Votos: "+getNumvotos();
	}
}


