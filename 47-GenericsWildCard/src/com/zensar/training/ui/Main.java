package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.CollegeEducationLoan;
import com.zensar.training.bean.EducationLoan;
import com.zensar.training.bean.Loan;

public class Main {
	
	static void print1(List<? extends Loan> list) {
		System.out.println(list);
	}
	
	static void print2(List<? super EducationLoan> list) {
		System.out.println(list);
	}
	
	static void print3(List<?> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		List<Loan> loanList1=new ArrayList<>();
		print1(loanList1);
		print2(loanList1);
		print3(loanList1);
		
		List<CarLoan> loanList2=new ArrayList<>();
		print1(loanList2);
		print2(loanList2); // error
		print3(loanList2);
		
		List<EducationLoan> loanList3=new ArrayList<>();
		
		print1(loanList3);
		print2(loanList3);
		print3(loanList3);
		
		List<CollegeEducationLoan> loanList4=new LinkedList<>();
		print1(loanList4);
		print2(loanList4);
		print3(loanList4);

		List<Integer> list5=new ArrayList<>();
		print1(list5);
		print2(list5);
		print3(list5);
		
		List<Object> list6=new ArrayList<>();
		print2(list6);
		print3(list6);
	}

}
