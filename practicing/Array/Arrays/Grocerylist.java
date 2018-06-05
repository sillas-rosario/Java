package Arrays;

import java.util.ArrayList;
public class Grocerylist {

	private ArrayList<String> grocerylist=new ArrayList <String>();
	
	

	public ArrayList<String> getGrocerylist() {
		return grocerylist;
	}

	public void setGrocerylist(ArrayList<String> grocerylist) {
		this.grocerylist = grocerylist;
	}
	
	
	// implementar os demais metodos:
	
	public void printList(){
	  System.out.print(" Voce tem "+ grocerylist.size()+ " de tamanho " );
	  
	  for(int i=0; i< grocerylist.size(); i++) {
          System.out.println((i+1) + " . " + grocerylist.get(i));
      
      }
	}
	  
	  public void modifyGroceryItem(String currentItem, String newItem) {
	        int position = findItem(currentItem);
	        if(position >= 0) {
	            modifyGroceryItem(position, newItem);
	        }
	        private void modifyGroceryItem(int position, String newItem) {
		// TODO Auto-generated method stub
		
	}

			private int findItem(String searchItem) {
	            
	        }
		
		
		
	}

	private int findItem(String currentItem) {
		return grocerylist.indexOf(searchItem);
	}
	
	
	
	
	
	
}
