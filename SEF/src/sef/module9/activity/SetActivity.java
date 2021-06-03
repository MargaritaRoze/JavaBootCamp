package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
Set animename = new HashSet();
 animename.add("PsychoPass");
 animename.add("CodeGeass");
 animename.add("DeathNote");

		
		System.out.println(animename.add("Psychopass"));
		System.out.println(animename.add("CodeGeass"));
		System.out.println(animename.add("DeathNote"));
		//2 - Call print method to print the set passed as its parameter.
		
	}
	
	void print(Set set)
	{
		Iterator i = set.iterator();
		 { System.out.println(i.next());
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}}}

