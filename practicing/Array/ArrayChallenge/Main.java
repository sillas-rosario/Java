package ArrayChallenge;

import java.util.Scanner;

public class Main {

	// Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.
	
	private static Scanner scanner = new Scanner(System.in);
	 private static Mobile ClassMobile=new Mobile("0800-00");
	 
	 
public static void menu(){
	System.out.println(" Escolha entre as opçoes \n " +
			" 1. adicionar novo contato \n" +
			" 2. Atualiza contato \n " +
			" 3.  exibir dados "+
			" 4.  sair ");
	
}
  	
	public static void main(String[] args){
		

		boolean quit=false;
		int contador=0;
		menu();
		
		while(!quit){
			
			System.out.print("Escolha uma das opçoes: ");
			contador=scanner.nextInt();
			
			switch(contador){
			
			case 0:
                menu();
                break;
            case 1:
            	 crearcontato();
                break;
            case 2:
                modificar();
                break;
            case 3:
                ClassMobile.exibir();
                break;
            case 4:
                quit = true;
                break;
			
			}
	}

}

	private static void crearcontato() {
		System.out.print("informe o nome : ");
		String nome=scanner.nextLine();
		System.out.print("\n informe o Numero : ");
		String numero=scanner.nextLine();
		
	    Contatos objeto= Contatos.CrearCont(nome,numero);
	    boolean boll=ClassMobile.addNewContact(objeto);
	   
	   if(boll==true){
		   System.out.println("Contato creado com sucesso \n"
				   + " Nome: " + nome + " numero : "+ numero);
	   }
		
	}
	
	private static void modificar(){
		System.out.println("informe nome do contato que deseja modificar");
		String nome=scanner.nextLine();
		System.out.println("\n informe o novo nome");
		String novonome=scanner.nextLine();
		System.out.print("\n informe o novo nome");
		String novonumero=scanner.nextLine();
		
		Contatos novo=new Contatos(novonome,novonumero);
        Contatos antigo=ClassMobile.up(nome);

		ClassMobile.Uploadcontact(novo,antigo);
		
	}
	
}