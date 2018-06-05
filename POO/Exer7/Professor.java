package Exer7;

public class Professor extends Empregado 
{
	public double valorHora;
	public int numHora;
	
	public Professor(double valorHora,int numHora,String nome, double encargos)
	{
		super();
		this.encargos = encargos;
		this.nome = nome;
		this.numHora = numHora;
		this.valorHora =valorHora;
	}

	public double getValorHora() 
	{
		return valorHora;
	}

	public void setValorHora(double valorHora)
	{
		this.valorHora = valorHora;
	}

	public int getNumHora() 
	{
		return numHora;
	}

	public void setNumHora(int numHora)
	{
		this.numHora = numHora;
	}

	public double salarioLiquido() 
	{
		double resp = (this.numHora*this.valorHora) - this.encargos;
		return resp;
	}

}
