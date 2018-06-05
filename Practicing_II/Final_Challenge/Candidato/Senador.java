package Candidato;

public class Senador extends Candidato{

//	matricula 134400042
// verificar a logica do limite
	
	public static int limite=222;
	public int numero;
	
	public Senador(String nome, String partido, long numvotos) {
		super(nome, partido, numvotos);
		// TODO Auto-generated constructor stub
	}




public int getNumero(){
	return numero;
}

public void setNumero (int numero)
{
	if((numero>=100)&&(numero<=999)){
		
	this.numero=numero;
	
	}
	
	else{
		
	this.numero=limite;
	limite++;
	
	}
}

public String Resultado(){
	
	return "Candidato: "+getNome()+"\nNumero: "+getNumero()+"\nN° de Votos: "+getNumvotos();
}

}