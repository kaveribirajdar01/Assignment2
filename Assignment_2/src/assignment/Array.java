package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
						
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Size Of The Array");
				int i1=sc.nextInt();
			    
				List<Integer> arr=new ArrayList();
				
				for(int i=0; i<i1; i++)
				{
					arr.add(sc.nextInt());
				}
				arr.forEach(s1->{if(s1%2!=0) 
				System.out.println(s1 + " is  Odd Number  ");});

			}

		}

	


