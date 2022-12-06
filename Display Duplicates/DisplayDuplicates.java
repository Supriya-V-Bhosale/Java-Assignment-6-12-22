package com.nissan.App;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
/*
Create an Array with duplicate array.Using collection
to print all duplicate value
*/
public class DisplayDuplicates {
	public static void main(String[] args) {
		//declare scanner object
		Scanner scanner =new Scanner(System.in);
		try {
		//take size of array from user
		System.out.println("Eneter size of array");
		int size=scanner.nextInt();
		int[] intArray=new int[size];
		
		//take values from user
		System.out.println("Eneter values....");
		for(int i=0;i<size;i++) {
			intArray[i]=scanner.nextInt();
		}
		DisplayDuplicates(intArray);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void  DisplayDuplicates(int[] intArray) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<intArray.length;i++) {
			map.put(intArray[i], map.getOrDefault(intArray[i],0)+1);
		}
		
		System.out.println("Displaying  duplicate value....");
		for(Integer ele : map.keySet()) {
			if(map.get(ele)>1) {
				System.out.println(ele + " : " +map.get(ele));
			}
		}
	}
	
	
	
	

}
