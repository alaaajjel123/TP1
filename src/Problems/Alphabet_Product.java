package Problems;
import java.util.Arrays;

public class Alphabet_Product {
	
	public static int alphabet(int[] ns) {
	    // Your code here. Good luck!
	    Arrays.sort(ns);
	    if (ns[0]==0){return ns[7]/ns[4];}
	      if((ns[0]*ns[1])==ns[2])
	        {return (ns[7]/ns[3]);}
	     else return (ns[7]/ns[2]);
	  }

}
