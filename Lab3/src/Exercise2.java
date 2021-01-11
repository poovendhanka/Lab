/**
	 * a class containing a method to create the mirror image of a String. 
	 * The method should return the two Strings separated with a pipe(|) symbol 
	 * @author Poovendhan
	 *
	 */

import java.util.*;
public class Exercise2 {
	
	      
	       public static String stringReverse(String str)
	       {
	    	    //sending String to StringBuffer
	              StringBuffer sbr = new StringBuffer(str);
	              //Adding Split Pipe To String
	              sbr.append('|');
	              // now sbr has "String|"
	              StringBuffer sb = new StringBuffer(str);
	              sb.reverse();
	              
	              sbr.append(sb);
	              return sbr.toString();
	       }
	       
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       
	        
           
            System.out.println("Enter a String");
            String str = sc.next();
            System.out.println(""+stringReverse(str));
	        
	        

	}

}
