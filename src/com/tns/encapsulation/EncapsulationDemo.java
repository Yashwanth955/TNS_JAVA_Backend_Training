package com.tns.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsConcept os = new OopsConcept();
		os.setAge(21);
		os.setName("Yashwanth");
		os.setSerialNum(122);
		
		System.out.println(os.getAge()+"\n"+ os.getName() +"\n" + os.getSerialNum());
	}

}
