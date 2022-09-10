package com.cg.Application;
import com.cg.Framework.*;

public class MMSavingAcc extends SavingAcc{

//	private final static float minBal = 0.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
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
		return ""+getAccNo()+"\t"+getAccNm()+"\t"+getAccBal()+"\t"+getIsSalary();
	}
	
	
}