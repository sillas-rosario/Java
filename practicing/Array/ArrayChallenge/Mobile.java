package ArrayChallenge;

import java.util.ArrayList;

import javax.swing.text.Position;

public class Mobile  {
	
	private ArrayList<Contatos> novaLista;
	private String myNumber;
	
	public Mobile(String myNumber){
		
		this.myNumber=myNumber;
		this.novaLista=new ArrayList<Contatos>();

	}

	public boolean addNewContact(Contatos contato){
		if(FindContato(contato.getNome())>=0){
			System.out.print(" Contato ja existe");
			return false;
			
		}
		novaLista.add(contato);
		return true;

	}
	
	
	
	public boolean Uploadcontact(Contatos contatoantigo, Contatos novocontato){
		
		int posicao=FindContato(contatoantigo);
		if (posicao<0){
			System.out.print(" Contato nao encontrado ");
			return false;
		}
		
		this.novaLista.set(posicao,novocontato);
		return true;
		
	}

	
	
	public int FindContato( Contatos contato){
		return novaLista.indexOf(contato.getNome());
		// retorna -1 se nao for encontado;	
	}
	
	
	
	public int FindContato(String buscanome){
		for(int i=0;i<novaLista.size();i++){
			if(novaLista.get(i).getNome().equals(buscanome)){
			return i;
			}
		}
		return -1;
				
		
	}

	
	public Contatos up(String nome){
		 int position= FindContato(nome);
		 if(position>=0){
			 
			 return this.novaLista.get(position);
		 }
		 return null;
	}
	
		 public void exibir(){
			 
			 System.out.println("Contact List");
		        for(int i=0; i<this.novaLista.size(); i++) {
		            System.out.println((i+1) + "." +
		                        this.novaLista.get(i).getNome() + " -> " +
		                        this.novaLista.get(i).getPhonenumber());
			 
			 
		 }
		 }

		
	}
	
	
	
