package Candidato;



public class Governador  extends Candidato
{
	
	
	public static int limite=22;
	public int numero;
	
	public Governador(String nome, String partido, long numvotos,int numero)
	{
		super(nome,partido,numvotos);
		setNumero(numero);
	}

	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero (int numero)
	{
		if((numero>=10)&&(numero<=99))
		{
		this.numero=numero;
		}
		else
		{
		this.numero=limite;
		limite++;
		}
	}
	
	public String Resultado()
	{
		return "Candidato: "+getNome()+"\nNumero: "+getNumero()+"\nN° de Votos: "+getNumvotos();
	}

}
