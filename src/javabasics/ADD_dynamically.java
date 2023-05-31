package javabasics;

import java.util.Scanner;

public class ADD_dynamically {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		
		
		int n2=sc.nextInt();
		
	
		System.out.println("first nmumber:"+n1);
		System.out.println("second nmumber:"+n2);
		System.out.println("adding two numbers:"+(n1+n2));
		sc.close();
	}

}
