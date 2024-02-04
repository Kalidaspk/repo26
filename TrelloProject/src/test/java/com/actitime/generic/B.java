package com.actitime.generic;

public class B
{
	public static void main(String[] args) { 
		A a1= new A();
		int x=a1.getValue(); //utilization 
		System.out.println(x); 
		a1.setValue(52); //utilization 
		System.out.println(a1.getValue()); 
		} 
	}