
package com.java.pgms;
import java.util.Scanner;
interface AP
{
	void input();
	void area();
	void perimeter();
}
public class Circle implements AP
{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		r=sc.nextInt();
	}
	public void area()
	{
		area=pi*r*r;
		System.out.println("area of circle"+area);
	}
	public void perimeter()
	{
		perimeter=3.14*r*r;
		System.out.println("perimeter of circle:"+perimeter);
	}
	}






