package com.zensar.training.bean.pack1;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="LOAN10")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOfLoan",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="L")
public class  Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
