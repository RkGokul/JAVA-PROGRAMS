package rk;

import java.util.Scanner;

public class Swapping {
	public static void main(String []arg){
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of x&y");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping:"+a+" "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("after swapping:"+a+" "+b);
		System.out.println();

	}

}
