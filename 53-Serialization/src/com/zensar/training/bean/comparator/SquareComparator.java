package com.zensar.training.bean.comparator;

import java.util.Comparator;

import com.zensar.training.bean.Square;

public class SquareComparator implements Comparator<Square>{

	@Override
	public int compare(Square o1, Square o2) {
		
		return o1.getSize()-o2.getSize();
	}

}
