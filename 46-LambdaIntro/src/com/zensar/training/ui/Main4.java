package com.zensar.training.ui;

import com.zensar.training.bean.Executable;

public class Main4 {

	public static void main(String[] args) {
		Executable<String> executable;
		executable=(s)->{
			System.out.println(s.toUpperCase());
		};
		
		executable.execute("zensar");
		
		Executable<Integer> executable1=(i)->{
			System.out.println(i.doubleValue());
		};
		
		executable1.execute(55);

	}

}
