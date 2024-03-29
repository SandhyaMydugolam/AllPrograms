package com.voya.training;

import java.util.Scanner;

public class ScanDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		String city =sc.nextLine();
		int age =sc.nextInt();
		System.out.println(">"+name);
		System.out.println(">"+city);
		System.out.println(">"+age);
	}

}
