package com.svkp.exceptions;

public class Student
{
     int sid;
     String sname;
     static String collegename="SVKP";
     public Student(int sid,String sname)
     {
    	 super();
    	 this.sid=sid;
    	 this.sname=sname;
    	 
     }
     void dsplay()
     {
    	 System.out.println(sid+""+sname+""+collegename);
     }
	public static void main(String[] args) 
	{
	   Student obj=new Student(101,"pavani");
	   Student obj1=new Student(102,"bhavani");
	   obj.dsplay();
	   obj1.dsplay();

	}

		
	

}
