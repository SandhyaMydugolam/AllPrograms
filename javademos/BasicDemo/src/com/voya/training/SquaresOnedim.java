package com.voya.training;

import java.util.Scanner;

public class SquaresOnedim {

	public static void main(String[] args) {
		int[] numbers = new int[5];
//		int[] squares = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers in array:");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
			
		}
		System.out.println("printing square of numbers:");
		for(int output : numbers) {
			 int squares = output*output;
			System.out.println(squares);
		}
		
		
 		}
}
