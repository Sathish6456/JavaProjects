package com.zensar.training.bean;

public class C {
   private int x;	
	
   public C() {
	   this(10);
	   System.out.println("C constructor called");
   }
   
   public C(int x) {
	  
	   this.x=x;
	   System.out.println("C constructor with arg called");
   }
}
