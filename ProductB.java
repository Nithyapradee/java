package com.company;
interface Bilgen{
	int calculate();
}

public class ProductB implements Bilgen{
 public String name;
 public int prodid,quantity,unitprice,total;
 ProductB(){
	 
 }
 public ProductB(String n,int p,int q,int u)
 {
	 name=n;
	 prodid=p;
	 quantity=q;
	 unitprice=u;
 }
 public int calculate()
 {
	 total=quantity*unitprice;
	 return total;
 }
}

