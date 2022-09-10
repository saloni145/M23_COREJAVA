package com.cg.Framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalary;
	private static final float MINBAL = 500;
/*	public SavingAcc() {
		// TODO Auto-generated constructor stub
	}
*/
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	
	public boolean getIsSalary() {
		return isSalary;
	}


	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
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
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
}
