import java.util.Hashtable;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Item{
	private String primaryName;
	private int weight;
	private Hashtable<String, String> messages;

public class Item {
  private String primaryName;
  private int weight;
  private Hashtable<String, String> messages;

  Item(Scanner s) { //Scanner
    Scanner in = new Scanner(System.in);
  }

  boolean goesBy(String name) { //Name of iter
    if (name == primaryName) {  
      return true;
    } else {
      return false;
    }  
  }

  String getPrimaryName() { //gets true name
    return primaryName;
  }

	public String toString(){
		return "messages";
	}

	public static void main(String args[]){
	  try{	
		  Scanner in = new Scanner(new FileReader (args[0]));
	  }	
	  catch(Exception e){
		  System.out.println("File not found.");
	  }
	}
}
}
