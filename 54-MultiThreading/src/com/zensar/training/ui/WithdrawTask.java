package com.zensar.training.ui;

public class WithdrawTask implements Runnable{
	
	BankAccount account;
	
	

	public WithdrawTask(BankAccount account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.withdraw(25);
		
	}

}
