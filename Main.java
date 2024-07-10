package com.java.pgms;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args)
	{
		System.out.println("enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Add ad=new Add(a,b);
		System.out.println("Addition" +ad.add());
		Sub s=new Sub(a,b);
		System.out.println("subtraction "+s.sub());
		Mult m=new Mult(a,b);
		System.out.println("product" +m.mult());
		Div d=new Div(a,b);
		System.out.println("quotient" +d.div());
		}

}
