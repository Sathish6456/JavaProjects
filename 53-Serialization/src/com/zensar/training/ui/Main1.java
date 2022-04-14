package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.zensar.training.bean.Circle;

public class Main1 {
	public static void main(String[] args) throws IOException {
		Circle circle=new Circle(10);
		
		OutputStream os=new FileOutputStream("circle.dat");
		ObjectOutputStream oos;
		oos=new ObjectOutputStream(os);
		
		oos.writeObject(circle);
		
		oos.flush();
		oos.close();
		os.close();
		
	}
}
