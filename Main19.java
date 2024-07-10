package com.java.pgms;
import java.io.File;


public class Main19 {
	public static void recursiveprint(File[] arr ,int index,int level)
	{
		if (index == arr.length)
			return;
		for(int i=0;i<level;i++)
		     System.out.println("\t");
		if(arr[index].isFile())
		
			System.out.println(arr[index].getName());
		else if (arr[index].isDirectory())
			{
				
			System.out.println("[" +arr[index].getName()+"]");
			recursiveprint(arr[index].listFiles(),0,(level+1));
			}
		    recursiveprint(arr,++index,level);
	}
	public static void main(String[] args)
	{
		String maindirpath="C:\\moosa";
		File maindir=new File(maindirpath);
		if(maindir.exists()&&maindir.isDirectory())
		
		{
			File arr[]=maindir.listFiles();
			System.out.println("********************");
			System.out.println("Files from me directory" +maindir);
			System.out.println("********************");
			recursiveprint(arr,0,0);
		
		}
		
	}

}

