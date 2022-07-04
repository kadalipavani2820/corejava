package com.svkp.exceptions;

public class DemoException {

	public static void main(String[] args) 
	{
	  int n1,n2;
	  try
	  {
		  n1=0;
		  n2=6;
		  int result=n2/n1;
		  System.out.println(result);
	  }
      catch(ArithmeticException e)
      {
    	  System.out.println("Divide by zero is not allowed");
      }
	}

	

		
	}


