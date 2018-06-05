package poli;

abstract class Animal {
    protected double peso;
    protected double idade;
    
    public  abstract void  Locomover();
    public  abstract void  Alimentar();
    public  abstract void  EmitirSom();
    
    
    
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
    
    
    
}
