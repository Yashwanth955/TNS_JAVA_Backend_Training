package com.tns.construtor;

import java.util.*;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		// p.setAge(21); //static
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name: ");
		String name = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter Gender ");
		String gender = sc.next();
		System.out.println("Enter Income ");
	}
}
