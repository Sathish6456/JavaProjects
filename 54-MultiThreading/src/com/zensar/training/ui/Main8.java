package com.zensar.training.ui;

public class Main8 {
	public static void main(String[] args) {
		
		BankAccount account=new BankAccount(6);
		DepositingTask depositingTask=new DepositingTask(account);
		WithdrawTask withdrawTask=new WithdrawTask(account);
		
		Thread t1=new Thread(depositingTask,"DT" );
		Thread t2=new Thread(withdrawTask,"WT");
		
		t1.start();
		t2.start();
				

	}
}
