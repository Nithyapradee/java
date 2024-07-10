package com.java.pgms;




public class Product {
	
	
	 String pname , pcode;
	   int price;
	   public String getpname()
	   {
		   return pname;
	   }
	   public Product(String productname,String pcode,int price)
	   {
		   this.pname=productname;
		   this.pcode=pcode;
		   this.price=price;
	   }
	   public Product()
	   {
	   }
	   public void setpname(String pname)
	   {
		   this.pname=pname;
		  
	   }
	   public String getpcode()
	   {
		   return pcode;
	   }
	   public void setpcode(String mode)
	   {
		   this.pcode=pcode;
	   }
	   public int getprice()
	   {
		   return price;
	   }
	   public void display()
	   {
		   System.out.println("pcode="+this.pcode);
		   System.out.println("pname="+this.pname);
		   System.out.println("price="+this.price);
	   }
	   
	   public static void main(String args[])
	   {
	   	    Product p1=new Product("Bens","ca123",100000);
	   	    System.out.println("***DisplY=p1***");
	   	   p1.display();
	   	    Product p2=new Product("jagwar","car426",25000);
	   	   System.out.println("***Display=p2***");
	   	    p2.display();
	   	 Product p3=new Product("mathuri","car800",500000);
	   	    		
	   	    System.out.println("***DisplY=p3***");
	   	    p1.display();
	   	 Product p=new Product();
	   	    if(p1.price < p2.price &&p1.price<p3.price)
	   	    	p=p1;
	   	    else if(p2.price<p3.price)
	   	    	p=p2;
	   	    	else
	   	    		p=p3;
	   	    System.out.println("***DisplY product with lowest price***");
	   	    p.display();
	   }
	   }
	   




