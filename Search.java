package com.java.pgms;
import java.util.Scanner;
public class Search {
 public static void main(String[] args)
		{
			System.out.println("enter number of employee:");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("enter employee details:");
			Employ Employ[]=new Employ[n];
			int eid,esal;
			String ename;
			for(int i=0;i<n;i++)
			{
			
				System.out.println("enter employee id(integer)");
				eid=sc.nextInt();
				System.out.println("enter employee name:");
				ename=sc.next();
				System.out.println("enter employee salary");
				esal=sc.nextInt();
				Employ emp=new Employ(eid,esal,ename);
				Employ[i]=emp;
			}
			System.out.println("employere details:\n");
			for(Employ y :Employ)
			{
				y.showData();
			}
			System.out.println("enter employee number for search:");
			int semp=sc.nextInt();
			boolean found=false;
			for( Employ e :Employ)
			{
				if(semp==e.eno)
				{
					found=true;
					System.out.println("employee found");
					e.showData();
					break;
				}
			}
		if(!found)
			System.out.println("employee not found");
		}
}



		



