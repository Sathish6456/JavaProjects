package com.zensar.training.ui;

public class DepositingTask implements Runnable{
	
	BankAccount account;
	
	

	public DepositingTask(BankAccount account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.deposit(30);
	}

}
