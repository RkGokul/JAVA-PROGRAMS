package rk;

import java.util.Scanner;

public class SmallestNumber {
	public static void main (String[]args)
	{
		int a,b,c,temp,smallest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		a= sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println("enter the third number:");
		c=sc.nextInt();
		temp=a<b?a:b;
		smallest=c<temp?c:temp;
		System.out.println("the smallest number is"+smallest);
	}

}
