package com.svkp.exceptions;

public class MyExceptionDemo extends Exception {
	private static int accno[]= {101,102,103,104,105};
	private static String name[]= {"pavani","bhavani","revathi","lakshmi","janu"};
	private static double bal[]= {10000.00,23000.89,300.00,19800.87,12200.00};
	
	MyExceptionDemo(String str)
	{
		super(str);
	}
	public static void main(String[] args) {
     try {
    	 System.out.println("Acc no"+"\t"+"Name"+"\t"+"Balance");
    	 for(int i=0;i<5;i++)
    	 {
    		 System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
    		 if(bal[i]<1000)
    		 {
    			 MyExceptionDemo ex=new MyExceptionDemo("Balance is less than 1000 for  ");
    			 throw ex;
    		 }
    	 }
    	 
     }
      catch(Exception e)
     {
    	  e.printStackTrace();
     }

	}

}
