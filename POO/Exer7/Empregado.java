package Exer7;

public abstract class Empregado 
{
	
	public String nome;
	public double encargos;
	
	public Empregado(){
		nome ="";
		encargos = 0;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getEncargos() 
	{
		return encargos;
	}

	public void setEncargos(double encargos)
	{
		this.encargos = encargos;
	}
	public abstract double salarioLiquido();

}
