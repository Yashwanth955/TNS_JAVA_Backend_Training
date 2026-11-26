package com.tns.construtor;
import java.util.*;
public class CustomerDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer c = new Customer();
		c.setCustomerCity("bengaluru");
		c.setCustomerName("yash");
		System.out.println(c);
		
		System.out.println("Enter Name:");
		String Name = sc.next();
		
		System.out.println("Enter Id:");
		int id = sc.nextInt(); 
		
		System.out.println("Enter city:");
		String city = sc.next();
		
		Customer c1 = new Customer(Name,id,city);
		System.out.println(c1);
		
	}

}
