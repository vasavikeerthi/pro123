package com.vk;

import java.util.Scanner;

import com.vk.DataBase;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice;
		String s = "";
		DataBase db = new DataBase();
		Person cu = new Person();
		Complaint co = new Complaint();
		do {
			System.out.println("Enter your choice : ");
			System.out.println("1. View all customers by name with keyId");
			System.out.println("2. Select a customer using keyId to view all complaints launched by customer");
			System.out.println("3. Select a complaint to view its status");
			System.out.println("4. Launch a new complaint");
			
			choice = sc.nextInt();
			
			if (choice < 0 && choice > 4) {
				System.out.println("Invalid...Please enter a valid number");
			}
			
			else {
				switch(choice) {
				case 1 : db.displayCustomers();
						 s = sc.nextLine();
						 break;
				case 2 : int i = sc.nextInt();
						 db.displayComplaints(i);
						 s = sc.nextLine();
						 break;
				case 3 : int id = sc.nextInt();
						 db.displayStatus(id);
						 s = sc.nextLine();
						break;
				case 4 : cu.launchComplaint();
						 s = sc.nextLine();
						 break;
				default : break;
				}
			}
			
		}while(choice > 0 && choice < 4);
		
	}

	}


