
package com.java.pgms;
import java.util.Scanner;
public class Mainrc 
{
public static void main (String[] args)
{
	int ch;
	Circle c=new Circle();
	Rectanle r=new Rectanle();
	Scanner s=new Scanner(System.in);
	System.out.println("1.area of circle\n 2.area of rectangle\n3.perimeter of circle\n4.perimeter of rectangle\n5.exit");
	ip:while(true)
	{
	System.out.println("make your choice");
	ch=s.nextInt();
	switch(ch)
	{
	case 1:c.input();
	c.area();
	break;
	case 2:r.input();
	r.area();
	break;
	case 3:c.input();
	c.perimeter();
	break;
	case 4:r.input();
	r.perimeter();
	case 5:break ip;
	default:System.out.println("invalid entry");
	}
}
}
}
