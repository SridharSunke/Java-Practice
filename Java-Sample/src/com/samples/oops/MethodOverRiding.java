package com.samples.oops;

public class MethodOverRiding {

		   //Overridden method
		   public void eat()
		   {
		      System.out.println("Human is eating");
		   }
		   
		   
		   private void sleep()
		   {
		      System.out.println("Human is eating");
		   }
		   
		   
		   final void work()
		   {
		      System.out.println("Human is eating");
		   }
		
		class Boy extends MethodOverRiding{
		   //Overriding method
		   public void eat(){
		      System.out.println("Boy is eating");
		   }
		   private void sleep()
		   {
		      System.out.println("Human is eating");
		   }
		}
		
		 public static void main( String args[]) {
			 MethodOverRiding obj = new MethodOverRiding();
		      //This will call the child class version of eat()
		      obj.eat();
		      obj.work();
		   }
}
