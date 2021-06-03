package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList<String>();
		list.add("Inga");
		list.add("Rita");
		list.add("Danja");
		list.add("Sanja");

		//2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(list);
	}
	
	void print(List list) {
		{
			System.out.println(list);
			//3 - Type code to print this list
			//Notice the order in which elements get printed.


		}
	}}