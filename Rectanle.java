package com.java.pgms;
import java.util.Scanner;


public class Rectanle implements AP
{
	int l=0,b=0;
	double area,perimeter;
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of the rectnglle");
		l=s.nextInt();
		System.out.println("enter the breadth of the rectangle");
		b=s.nextInt();
	}
	public void area()
	{
		area=l*b;
		System.out.println("area of  rectangle:"+area);
	}
	public void perimeter()
	{
		perimeter=2*(l*b);
		System.out.println("peremiter of rectangle:"+perimeter);
	}
}







