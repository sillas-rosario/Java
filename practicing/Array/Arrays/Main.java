package Arrays;

import java.util.Scanner;

public class Main {
	
	// Metodo parecido com o JOptionPane porem nao abre um conteiner 
	// no caso seria o oposto do System.out.println
	private static Scanner scanner = new Scanner(System.in);
	
	private static Grocerylist objeto=new Grocerylist();
	
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
                 objeto.printList();
                break;
            case 2:
                //addItem();
                break;
            case 3:
                //modifyItem();
                break;
            case 4:
               // removeItem();
                break;
            case 5:
                //searchForItem();
                break;
            case 6:
                quit = true;
                break;
			
			}
			
			
		}
		
		
		
		
		
		
	}
	public static void menu(){
		System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
		
	}

}
