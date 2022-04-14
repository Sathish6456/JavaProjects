package com.zensar.training.bean;

import java.time.LocalDate;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Bills30")
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int billId;
	String customerName;
	LocalDate billDate;
	
	@Transient
	int index;
	
	@ElementCollection
	@OrderColumn(name="idx")
	@CollectionTable(name="Bills30_Collect")
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

