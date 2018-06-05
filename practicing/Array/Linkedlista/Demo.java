package Linkedlista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	
	public static void main( String args[]){
		
		LinkedList<String> PlaceToVisit=new LinkedList<String>();
		
		PlaceToVisit.add("Sydney");
		PlaceToVisit.add("Melborn");
		PlaceToVisit.add("Brisbane");
		PlaceToVisit.add("Perth");
		PlaceToVisit.add("Canberra");
		PlaceToVisit.add("Adelaide");
		PlaceToVisit.add("Darwin");
		printlist(PlaceToVisit);
		
		//PlaceToVisit.add(1,"Alice Springs"); // alocando a posicao 1 para alice springs
		//printlist(PlaceToVisit);
		
		//PlaceToVisit.remove(4);
		//printlist(PlaceToVisit);
		
		brincandoComInterador(PlaceToVisit);
	}
public static void printlist( LinkedList<String>PlaceToVisit ){
	// interator é um jeito de acessar os dados em uma lista note que o i é como se fosse um objketo
	Iterator<String> i=PlaceToVisit.iterator();
	
	// .hasNext() retorna um valor boolean (true) enquando a lista tiver um objeto para apontar
	// em segquida. reumindo .hasNext() == " existe algum dado em seguida??" se sim  -> ans true
	while(i.hasNext()){
		//i.next() vai mudando o valor de i e apontando para o proxiumo
		// bem parecido com o i++
		// .next() == moving to another entry
		System.out.println(" visiting "+ i.next());
			
		}
	System.out.print("-------------");
		
	}


//colocar as cidades em ordem alfabetica
private static boolean addInorder(LinkedList<String> Linkedlist,String newCity){
	
	ListIterator<String> stringlistIterator =Linkedlist.listIterator();
	//has next == go through all records
	
	while(stringlistIterator.hasNext()){
		int comparation=stringlistIterator.next().compareTo(newCity);
		if (comparation==0){
			System.out.println(" ja exuste");
			return false;
		}
		else if(comparation>0){
			//
			stringlistIterator.previous();
			stringlistIterator.add(newCity);
			return true;
			
		}
		else if(comparation<0){
			// nao precisa fazer nada 
		}
		
	}
	stringlistIterator.add(newCity);
	return true;
}


private static void brincandoComInterador(LinkedList<String>lista){
	
	ListIterator<String> teste_interador =lista.listIterator();
	//criei um interador do tipo list
	
	for(int i=1;i<7;i++){
	 String teste01=teste_interador.next();
     System.out.println("\n teste 01.Next()"+"looping"+i +" - "+ teste01 );
	}
     boolean  teste02=teste_interador.hasPrevious();
     if(!teste02){ 
    	 System.out.println(" nao existe ninguem apontando");
    	 }
     else{
     System.out.println("\n teste 01.hasPrevious()"+ teste02 + " \nelemento = "+ teste_interador.next());
     }
     
    
     
     int  teste03=teste_interador.previousIndex();
     System.out.print("teste 03- previus index"+  teste03);
	
	
}
}