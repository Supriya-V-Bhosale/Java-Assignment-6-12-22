package com.nissan.App;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneBookList {
	//Declare global scanner object
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {		
		List<Long> PhoneBook=new ArrayList<>();
		char choice='n';
		try {
			do {
				System.out.println("Enetr choice\n1.Add\n2.Delete\n3.Search\n4.Diplay Phone Book");
				int input=scanner.nextInt();
				switch(input) {
					case 1:addPhoneNumber(PhoneBook);
						break;
					case 2:DeleteNumer(PhoneBook);
						break;
					case 3:searchPhoneNumber(PhoneBook);
						break;
					case 4:Display(PhoneBook);
						break;
					default:
						System.out.println("Invalid Input");
				
				}
				System.out.println("Do you want to continue...(y/n)");
				choice=scanner.next().charAt(0);
				
				if(choice!='y') {
					System.out.println("Thank You.....");
				}
			}while(choice=='Y' || choice=='y');
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void Display(List<Long> phoneBook) {
		System.out.println("Displaying Phone Book.....");
		for(long number:phoneBook) {
			System.out.println(number);
		}
		
	}
	private static void sortPhoneBook(List<Long> phoneBook) {
		Collections.sort(phoneBook);
	}

	private static void searchPhoneNumber(List<Long> phoneBook) {
		//take input from user
		System.out.println("Enetr number");
		long number=scanner.nextLong();
		
		for(long phoneNumber:phoneBook) {
			if(phoneNumber==number) {
				System.out.println("Found it");
				return;
			}
			
		}
		System.out.println("Entered number is not present in Phone Book");

		
	}

	private static void DeleteNumer(List<Long> phoneBook) {
		phoneBook.remove(0);
		sortPhoneBook(phoneBook);
	}

	private static void addPhoneNumber(List<Long> phoneBook) {
		try {
			System.out.println("Enter a Phone Number");
			long number=scanner.nextLong();
			phoneBook.add(number);
			sortPhoneBook(phoneBook);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

