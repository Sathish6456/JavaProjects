package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zensar.training.bean.Circle;

public class Main2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Circle circle=null;
		
		InputStream is=new FileInputStream("circle.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		
		circle=(Circle)ois.readObject();
		
		System.out.println(circle);
		
		ois.close();
		is.close();

	}

}
