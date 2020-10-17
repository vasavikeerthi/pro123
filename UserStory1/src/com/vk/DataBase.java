package com.vk;



public class DataBase {
	Customer [] customer_list;

	 public DataBase() {
		super();
		// TODO Auto-generated constructor stub
		customer_list = new Person[3];
	
				Complaint[] c1 = {new Complaint(1,"Laptopissue","batterybackupispoor",0,1),new Complaint(2,"workdayportal","Cantaccess",0,1),new Complaint(3,"Dongle","Approval",0,1)};
		Complaint[] c2 = {new Complaint(4,"Weightgain","Fat accumulation ",0,2),new Complaint(5,"Hairfall", "Dandruff",0,2)};
		
		Complaint[] c3 = {new Complaint(6,"productquality","No guarantee",0,3)};
		
		customer_list[0]=new Person(1,"neeha",c1);
		customer_list[1]=new Person(2,"reethu",c2);
		customer_list[2]=new Person(3,"revanth",c3);
		
	 }
		
	 
	public void displayCustomers() {
		
		System.out.println("Name : neeha, ID : 1");
		System.out.println("Name : reethu, ID : 2");
		System.out.println("Name : revanth, ID : 3");
		
	}
	
	public void displayComplaints(int id) {
		
		System.out.println("Customer " + id + " made");
		
		if (id == 1) {
			System.out.println("Complaint 1 as d1");
			System.out.println("Complaint 2 as d2");
			System.out.println("Complaint 3 as d3");
		}
		
		else if (id == 2) {
			System.out.println("Complaint 1 as d4");
			System.out.println("Complaint 2 as d5");
		}
		
		else if (id == 3) {
			System.out.println("Complaint 1 as d6");
		}
		
	}
	
	public void displayStatus(int id) {
		
		Complaint c = new Complaint();
		int ch = c.status;
		
		if (ch == 0) {
			System.out.println("Under process");
		}
		
		else if (ch == 1) {
			System.out.println("Complete");
		}
		
	}
	
}







