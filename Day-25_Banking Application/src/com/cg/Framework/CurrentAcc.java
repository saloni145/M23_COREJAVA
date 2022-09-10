package com.cg.Framework;

public abstract class CurrentAcc extends BankAcc {

	private final float creditLimit;
	
	/*public CurrentAcc() {
		// TODO Auto-generated constructor stub
	}
*/
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}

	
	public float getCreditLimit() {
		return creditLimit;
	}


	@Override
	public abstract void withdraw(float amount);
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
}
	