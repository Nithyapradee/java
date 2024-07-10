package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Program13 {

	public static void main(String[] args) {
		
		ProductB[][] order;
		System.out.println("Enter number of orders: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		order=new ProductB[n][];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number of products for order = "+(i+1));
			int m=sc.nextInt();
			order[i]=new ProductB[m];
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter product "+(j+1)+" name = ");
				String a=sc.next();
				System.out.println("Enter product id = ");
				int b=sc.nextInt();
				System.out.println("Enter product quantity = ");
				int c=sc.nextInt();
				System.out.println("Enter product  unit price = ");
				int d=sc.nextInt();
				ProductB pb=new ProductB(a,b,c,d);
				order[i][j]=pb;
				order[i][j].total=order[i][j].calculate();
				
			}
		
		for( i=0;i<n;i++) {
			int sum=0;
			//System.out.println("b========="+b);
			System.out.println("Order number "+(i+1));
			System.out.println();
			Date date=java.util.Calendar.getInstance().getTime();
			System.out.println(date);
			System.out.println("-------------------------------------------------------------");
			int prodid;
			String name;
			//System.out.println("PRODUCT-ID	PRODUCT-NAME	QUANTITY	UNIT-PRICE	TOTAL");
			System.out.println("PRODUCT-ID	PRODUCT-NAME	QUANTITY	UNIT-PRICE	TOTAL");
			//System.out.println();
			System.out.println("---------------------------------------------------------------");
			for(int j=0;j<order[i].length;j++)
			{
				
			
				System.out.println(order[i][j].prodid   + "\t\t"  +order[i][j].name   +"\t\t"    + order[i][j].quantity       +"\t\t"       +order[i][j].unitprice     +"\t\t"    + order[i][j].total);
				System.out.println();
			}
			for(int t=0;t<order[i].length;t++)
				sum=sum + order[i][t].total;
			System.out.println("Net amount: "+sum);
			System.out.println("----------------------------------------------------------------");
			
		}
	}

}
}

