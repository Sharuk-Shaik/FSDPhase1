package com.client;
import java.io.*;
import java.util.*;
import com.model.operations.BusinessLevelOperations;

public class Appmain {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

	public static void welcomeScreen() {
		System.out.println("\t\tWelcome to LOCKED ME \n");
		System.out.println("\t\tDeveloped by Sharuk Shaik \n");
		System.out.println("Please Press any key to continue");
	
		Scanner Scanner = new Scanner(System.in);
        String s= Scanner.nextLine();
		
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperations obj = new BusinessLevelOperations();
		int option;
		do {
		System.out.println("Enter your choice from the following: \n");
		System.out.println("\t1. Retrieve current files in ascending order \n");
		System.out.println("\t2. Business operations menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
	      do {
			System.out.println("Enter your choice from the following");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Search for a file and show its content");
			System.out.println("\t4. Exit from BO menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exiting from BO menu");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
				
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application");
			break;
		default:
			System.out.println("Invalid choice \n\n");
		}
		
		}while(option!=3);
		
	}
}
