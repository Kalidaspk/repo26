package com.actitime.generic;

import java.io.IOException;

import com.actitime.testscript.FileLib;

public class DemoGenricLibarary 
{
	public static void main(String[] args) throws IOException {

		//reading the data from the properties file
		FileLib f = new FileLib();
		System.out.println(f.getPropertyData("username"));
		System.out.println(f.getPropertyData("password"));
		System.out.println(f.getPropertyData("URL"));
//		reading data from excel-sheet
		System.out.println(f.getExcelData("createcustomer", 1, 2));
//		writing the data to excel-sheet
		System.out.println(f.getExcelData("createcustomer", 2, 1));
	}
}
