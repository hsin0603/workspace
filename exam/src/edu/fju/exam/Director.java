package edu.fju.exam;

public class Director extends Employee {
	int rad;

	public Director(String name, int money, int rad) {
		super(name, money);
this.rad=rad;
	}

	@Override
	public void print() {
		System.out.println(name + "\t" + (money + 5000) + "(" + rad + ")");

	}

}
