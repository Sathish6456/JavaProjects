package com.zensar.training.bean.comparator;

import java.util.Comparator;

import com.zensar.training.bean.Customer;

public class CustomerBalanceComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getBalanceAmount()<o2.getBalanceAmount())
			return -1;
		if(o1.getBalanceAmount()>o2.getBalanceAmount())
			return 1;
		return 0;
	}

}
