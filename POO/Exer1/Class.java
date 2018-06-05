package Exer1;

public class Class {
	
	String nome;
	double salario;
	double gastos;
	double impostos;
	
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	public double getGastos()
	{
		return gastos;
	}
	public void setGastos(double gastos)
	{
		this.gastos = gastos;
	}
	public double getImpostos()
	{
		return impostos;
	}
	public void setImpostos(double impostos)
	{
		this.impostos = impostos;
	}
	
	public double  getSaldo()
	{
		double saldo;
		saldo = salario - (gastos+impostos);
		return saldo;
	}
		

}
