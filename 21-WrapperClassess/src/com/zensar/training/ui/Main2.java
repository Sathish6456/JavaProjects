package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		byte b=100;
		Byte obj=new Byte(b);
		
		double v1=obj.doubleValue();
		float v2=obj.floatValue();
		System.out.println(v1+","+v2);
		
		String str="125";
		byte v3=Byte.parseByte(str);
		System.out.println(++v3);

	}

}
