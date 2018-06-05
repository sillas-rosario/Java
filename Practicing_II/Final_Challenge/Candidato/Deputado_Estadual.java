package Candidato;

// Matricula 134400042

public class Deputado_Estadual extends Candidato{
	
//	matricula 134 40004 2
// verificar a logica do limite
	
	public static int limite_superior=40004;
	public int numero;
 
	
	public int getNumero(){
		return numero;
	}
	
	// Usei a mesma logica do trabalho 1
	
	public void setNumero (int numero){
		
		if( numero<40004 && numero>10000 ){
			
			this.numero = numero;
	
		}
		else{
			
			this.numero=limite_superior;
			limite_superior--;
			
		}
	}
	
	 
		public String Resultado(){
			return "Candidato: "+getNome()+"\nNumero: "+getNumero()+"\nN° de Votos: "+getNumvotos();
		}
		
	
	
	public Deputado_Estadual(String nome, String partido, long numvotos,int numero){
		super(nome,partido,numvotos);
		setNumero(numero);
		
	}
	
}

