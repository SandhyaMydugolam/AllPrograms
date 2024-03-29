package com.voya.training;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String[] usernames = {"kutlu","kevin"};
		Scanner sc = new Scanner(System.in);
		boolean ispresent = false;
		String uname = sc.next();
		for(String username :usernames) {
			if(username.equalsIgnoreCase(uname)) {
				System.out.println("Name already exists");
				break;
			}else {
				System.out.println("reg");
				break;
			}
		}
		
	if(!ispresent)
		System.out.println("you are registred");
		
		
	}

}
