package com.zensar.training.bean;

import java.util.Comparator;

public class RectangleHeightComparator implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if(o1.height<o2.height)
			return -1;
		if(o1.height>o2.height)
			return 1;
		return 0;
	}

}
