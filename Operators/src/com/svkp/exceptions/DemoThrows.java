package com.svkp.exceptions;

import java.io.IOException;

public class DemoThrows
{

	
	   int division(int a,int b)throws ArithmeticException,IOException
	   {
		   int result=a/b;
		   return result;
	   }
	   public static void main(String[] args)   
	   {
		   DemoThrows obj= new DemoThrows();
		   try
		   {
			   System.out.println("obj.division(22,5)");
		   }
		   catch(ArithmeticException e) 
		   {
			  e.printStackTrace(); 
		   }
	   }

}
