import java.util.Scanner;
import java.io.*;

/*
 * This class implements a spell checker application. 
 * This class requires a proper implementation to the StirngSet class.
 */
public class SpellChecker {
	
	public String suggestions(String letters)
	{
		return letters;
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String [] args) {

		File f = new File("dictionary");
		String tout = null;
		String check = null;
    
    try {
      Scanner scan = new Scanner(f);
        
      StringSet x = new StringSet();
    
      // Read in the entire dictionary...
      while (scan.hasNext()) {
        String letters = scan.next();
        x.insert(letters);      
      }
      System.out.println("Dicitonary loaded...");
     
      scan = new Scanner(System.in);
      
      // Keep suggesting alternatives as long as the user makes an input.
      while (scan.hasNext()) {
    	  String letters = scan.next();
    	  if (x.find(letters))
    		  System.out.println(letters + " is correct.");
    	  else 
    	  {
    		  System.out.println("Suggesting alternatives ...");
    		  int count = letters.length();
    		  
    		  StringBuffer str = new StringBuffer(letters);
    		  tout = letters;
    		  
    		  for (int i = 0; i < count; ++i)
    		  {
    			  int counter = 0;
    			  while (!x.find(letters) && (counter <= 25))
    			  {
    				  str = new StringBuffer(letters);
    				  for (char j = 'a'; j <= 'z'; ++j)
    				  {
    					  str.setCharAt(i, j);
    					  letters = str.toString();
    					  counter++;
    					  
    					  if (x.find(letters))
    					  {
    						  System.out.println(letters);
    					  }
    				  }
    			  }
    			  letters = tout;
    		  }
    	  }
      }
			
    } catch (FileNotFoundException e) {
      System.out.println("Cannot open file " + f);
      System.out.println(e);
    } 
  } 
}
