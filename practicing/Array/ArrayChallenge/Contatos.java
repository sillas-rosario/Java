package ArrayChallenge;

public class Contatos {

	private String nome;
	private String phonenumber;
	
	public Contatos(String nome, String phonenumber) {
		this.nome = nome;
		this.phonenumber = phonenumber;
	}

	public String getNome() {
		return nome;
	}

	public String getPhonenumber() {
		return phonenumber;
	}
	
	
	public static Contatos CrearCont(String nome, String phonenumber){
		return new Contatos(nome,phonenumber); // chama o contrutor novamente
		
	}
	
	
}
