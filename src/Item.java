import java.util.Hashtable;
import java.util.Scanner;
public class Item{
	private String primaryName;
	private int weight;
	private Hashtable<String, String> messages;

	Item(Scanner s){
		Scanner in = new Scanner(System.in);
	}

	boolean goesBy(String name){
	if(name == primaryName){		
		return true;		
	}
	else{
		return false;
	}	
	}

	String getPrimaryName(){
		return primaryName;	
	}

	String getMessageForVerb(String verb){
		return verb;	
	}

	public String toString(){
		return "messages";
	}
}
