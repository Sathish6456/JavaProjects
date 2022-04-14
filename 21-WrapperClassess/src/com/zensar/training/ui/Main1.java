package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		int a=800;
		Integer obj1=new Integer(a);
		
		double d=	obj1.doubleValue();
		System.out.println(d);
		
		long l=obj1.longValue();
		System.out.println(l);
		
		int i=obj1.intValue();
		System.out.println(i);
		
		byte b=obj1.byteValue();
		System.out.println(b);
		
		
		String s1="124";
		int r=Integer.parseInt(s1);
		System.out.println(++r);
		
		System.out.println(Integer.toBinaryString(8345));
		System.out.println(Integer.toOctalString(8345));
		System.out.println(Integer.toHexString(8345));
		System.out.println(Integer.toString(8345, 16));
		
	}

}
