package com.zensar.training.bean;

import java.time.LocalDate;

public class Bill {

	int billId;
	String customerName;
	LocalDate billDate;
	int index;
	
	BillItem[] billItems=new BillItem[3];

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public BillItem[] getBillItems() {
		return billItems;
	}

	public void setBillItems(BillItem[] billItems) {
		this.billItems = billItems;
	}

	public void addBillItem(BillItem billItem) {
		this.billItems[index++]=billItem;
		}
}

