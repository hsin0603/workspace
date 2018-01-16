package edu.fju.exam;

public class Employee {
	int money ;
	String name ;
	
	public Employee(String name , int money){
		this.name = name;
		this.money = money;
	}
	public void print(){
		System.out.println(name+"\t"+money);
	}

}
