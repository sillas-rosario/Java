package Exer2;

public class fig 
{
	
	double altura;
	double largura;
	
	
	public double getAltura() 
	{
		return altura;
	}
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	public double getLargura() 
	{
		return largura;
	}
	public void setLargura(double largura)
	{
		this.largura = largura;
	}
	
	public double getArea()
	{
		double area;
		area=altura*largura;
		return area;
	}

}
