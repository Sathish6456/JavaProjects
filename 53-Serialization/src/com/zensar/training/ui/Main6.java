package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.zensar.training.bean.Circle;

public class Main6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream is=new FileInputStream("circles.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		List<Circle> circles;
		circles=(List<Circle>)ois.readObject();
		System.out.println(circles);
		
		ois.close();
		is.close();
	}

}
