package Exer7;

public class Funcionario extends Empregado
{

	public double salario;
	
	public Funcionario(double salario,String nome, double encargos)
	{
		super();
		this.encargos = encargos;
		this.nome= nome;
		this.salario = salario;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	public double salarioLiquido() 
	{
		double soma = this.salario - this.encargos;
		return soma;
	} 

}
