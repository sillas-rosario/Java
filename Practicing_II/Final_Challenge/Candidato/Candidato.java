package Candidato;


public abstract class Candidato {
	
	private String nome,partido;
	private long numvotos;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}

	public long getNumvotos() {
		return numvotos;
	}


	public void setNumvotos(long numvotos) {
		this.numvotos = numvotos;
	}
	
//Polimorfismo
	public abstract String Resultado();

	public Candidato(String nome, String partido, long numvotos){
		super();
		setNome(nome);
		setPartido(partido);
		setNumvotos(numvotos);
	}

}
