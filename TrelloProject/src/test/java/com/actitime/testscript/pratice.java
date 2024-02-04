package com.actitime.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class pratice
{
//	write a program to alertpopup
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Runtime.getRuntime().exec("notepad");
		
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_S);
		
		
		
	
	
	
	}	}