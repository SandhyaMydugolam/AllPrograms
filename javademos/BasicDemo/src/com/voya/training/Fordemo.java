package com.voya.training;

public class Fordemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			int x =5;
			int y = x*i;
			System.out.println(x+"*"+i+"="+y);
		}
		int x =0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		System.out.println();
		
		// now the value of x is 10
		do {
			System.out.println(x);
			x--;
		} while (x > 0);
	}

}
