package com.java.pgms;

public class RamProcessor 
{
	public static void main(String[] args)
	{
		Cpu c1 = new Cpu();
		Cpu.Processor p1=c1.new Processor();
		Cpu.RAM ram=c1.new RAM();
		System.out.println("processor_cache=" +p1.getcache());
		System.out.println("Ram_check_speed=" +ram.getcheckspeed());
	}

}
