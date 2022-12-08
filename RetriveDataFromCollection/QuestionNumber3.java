package com.nissan.App;

import java.util.HashMap;
import java.util.Scanner;

public class QuestionNumber3 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		System.out.println("Eneter number");
		try (Scanner scanner = new Scanner(System.in)) {
			int size=scanner.nextInt();
			for(int i=1;i<=size;i++) {
				System.out.println("Eneter name");
				String name=scanner.next();
				hm.put(i, name);
			}
			
			for(Integer ele:hm.keySet()) {
	
				System.out.println(hm.get(ele));
				
			}
		}
		
		
	
		
	}

}
