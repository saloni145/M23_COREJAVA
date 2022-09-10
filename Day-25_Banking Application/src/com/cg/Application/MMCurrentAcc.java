package com.cg.Application;
import com.cg.Framework.*;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount > getAccBal() || (getAccBal()-amount)<500) {
			System.out.println("Cannot proceed further..Invalid amount");
		}
		else {
			setAccBal(getAccBal()-amount);
			
		}
	}

	@Override
	public void deposit(float amount) {
		
	}

	@Override
	public String toString() {
		return ""+getAccNo()+"\t"+getAccNm()+"\t"+getAccBal()+"\t"+getCreditLimit();
	}
	
}