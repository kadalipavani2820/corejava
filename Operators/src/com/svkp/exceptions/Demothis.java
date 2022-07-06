package com.svkp.exceptions;

public class Demothis {
	int id;//instance variable
	String name;
	
     public Demothis(int id,String name)//local variable
     {
    	 this.id=id;
    	 this.name=name;
     }
     void display()
     {
    	 System.out.println(id+""+name);
     }
	public static void main(String[] args)
	{
		Demothis obj= new Demothis(101,"pavani");
		obj.display();

	}

}
