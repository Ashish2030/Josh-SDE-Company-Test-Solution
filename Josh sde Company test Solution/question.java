/*
Given a list of words,arrange them in such a way that when combined they form the 
word which comes at the end of the dictionary by every possible arrangement
*/






import java.util.*;
class question { 

	static LinkedList<String> reverse(LinkedList<String>o)
	{
	    Collections.reverse(o);
	    return o;
	    }


	public static void main(String[] args) 
	{ 
	
      LinkedList<String> o=new LinkedList<>();
	o.add("a");
		o.add("ll");
			o.add("uu");
				o.add("q");
					o.add("p");
					System.out.println("question input"+o);
					System.out.println("output "+reverse(o));
	} 
} 
