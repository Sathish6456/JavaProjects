package com.zensar.training.bean.pack2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
@Table(name="LOANS20")
public class  Loan {
	
	@Id
	int loanId;
	String customerName;
	double loanAmt;
	Date loanDate;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerName=" + customerName
				+ ", loanAmt=" + loanAmt + ", loanDate=" + loanDate + "]";
	}
	
	

}
