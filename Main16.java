package com.java.pgms;
import java.util.Scanner;

public class Main16 {
	public static void main(String[] args)

	{
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("enter username:");
		username=s.nextLine();
		System.out.println("enter password");
		password=s.nextLine();
		int length=username.length();
		try
		{
			if(length<6)
			    throw new UsernameException("username must be greater than six characters:");
			else if(!password.equals("hello"))
			    throw new passwordException("incorrect password /n type_correct_password ");
			else
				 System.out.println("login successfull");
		}
		catch(UsernameException u)
		
		{
			u.printStackTrace();
			
		}
		catch(passwordException p)
		{
			p.printStackTrace();
		}
		finally
		{
			System.out.println("finally statement is executed:");
		}
	}
	
}




















	

