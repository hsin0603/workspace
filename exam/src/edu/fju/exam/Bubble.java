package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int[] numbers = {45,81,9,72,4,6} ;
		for (int a = 0;a < 6;a++){
			for(int i = a + 1; i < 6;i++){
				if(numbers[a] < numbers[i]){
					int tmb = numbers[i];
					numbers[i] = numbers[a];
					numbers[a] = tmb;
					
				}
			}
			System.out.print(numbers[a]+" ");
		}
		System.out.println();
		int[] numbers2 = {6,5,2,8,1,9,13,4,11,7} ;
		for (int z = 0;z < 10;z++){
			for(int x = z + 1; x < 10;x++){
				if(numbers2[z] < numbers2[x]){
					int tmb2 = numbers2[x];
					numbers2[x] = numbers2[z];
					numbers2[z] = tmb2;
					
				}
			}
			System.out.print(numbers2[z]+" ");
		}

	}

}
