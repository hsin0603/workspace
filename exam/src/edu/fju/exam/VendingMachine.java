package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int price = 0;
		System.out.println("販賣機餘額:"+price);
		while(true){
		System.out.print("投幣或選擇飲料, 有8種(a、b、c、d、e、f、g、h)，或輸入0結束:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		switch (line) {
		case "1":
			price = price + 1;
			System.out.println("販賣機餘額:"+price);
			break;
		case "5":
			price = price + 5;
			System.out.println("販賣機餘額:"+price);
			break;
		case "10":
			price = price + 10;
			System.out.println("販賣機餘額:"+price);
			break;
		case "a":
			if(price >= 10){
			price = price -10 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "b":
			if(price >= 15){
			price = price -15 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "c":
			if(price >= 10){
			price = price -10 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "d":
			if(price >= 18){
			price = price -18 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "e":
			if(price >= 10){
			price = price -10 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "f":
			if(price >= 20){
			price = price -20 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "g":
			if(price >= 15){
			price = price -15 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "h":
			if(price >= 18){
			price = price -18 ;
			System.out.println("販賣機餘額:"+price);
			System.out.println("DON!");}else{
				System.out.println("販賣機餘額:"+price);
				System.out.println("BEEP!");
			}
			break;
		case "0":
			price = price - 100000;
			break;
		default:
			break;
		}if(price<0){
			 	System.out.println("結束");
			 		break;
		
		}
		}
	}
	}
