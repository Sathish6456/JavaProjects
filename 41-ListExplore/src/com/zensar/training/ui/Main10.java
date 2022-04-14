package com.zensar.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.RectangleHeightComparator;

public class Main10 {

	public static void main(String[] args) {
		RectangleHeightComparator comparator=new RectangleHeightComparator();
		
		Set<Rectangle> myset=new TreeSet<>(comparator);
		
		myset.add(new Rectangle(1000, 200));
		myset.add(new Rectangle(100, 50));
		
		System.out.println(myset);

	}

}
