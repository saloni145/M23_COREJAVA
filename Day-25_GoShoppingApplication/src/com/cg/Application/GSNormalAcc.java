package com.cg.Application;

import com.cg.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
	public GSNormalAcc(int accNo,String accNm,float charges,float deliveryCharges)
	{
		super(accNo,accNm,charges,deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	
	

}