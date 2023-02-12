package assignment2;

import java.util.HashMap;

public class Cube_Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer>numbers=new HashMap<>();
		for(int i=1;i<=15;i++)
		{
			numbers.put(i,i*i*i);
		}
		
		for(int a:numbers.keySet())
		{
			System.out.println(a+" "+numbers.get(a));
		}

	}

}
