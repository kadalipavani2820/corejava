package com.svkp.exceptions;

public class DemoThrow
{
  void checKAge(int age)
  {
	  if(age<18)
		  throw new ArithmeticException("Not eligiblefor voting");
	  else
		  System.out.println("Eligible for voting");
  }
	public static void main(String[] args)
	{
		DemoThrow obj=new DemoThrow();
		obj.checKAge(18);
	}

}
