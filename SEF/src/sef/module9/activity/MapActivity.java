package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.MapSample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapActivity {

	static String temp = "My Testing" ;
	
		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			map.put ("1234", "Sanja");
			map.put("4567","Danja");
			map.put("8899","Rita");


			//2 - Call print method to print the map passed as its parameter.

			System.out.println(map.get("1234"));
			System.out.println(map.get("4567"));
			System.out.println(map.get("8899"));

			new MapActivity().print(map);
		}
			void print(Map map){
			Set keySet = map.keySet();
				System.out.println("-");
				System.out.println("Key\tValue");
		}}
				
				

		


