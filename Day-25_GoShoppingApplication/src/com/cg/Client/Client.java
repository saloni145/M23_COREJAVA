package com.cg.Client;

import com.cg.Application.GSNormalAcc;
import com.cg.Application.GSPrimeAcc;
import com.cg.Application.GSShopFactory;
import com.cg.Framework.NormalAcc;
import com.cg.Framework.PrimeAcc;
import com.cg.Framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Hrushikesh",500,true);
		NormalAcc n=new GSNormalAcc(1002,"Vaishnavi",500,50);
		System.out.println("Prime Account:");
		p.bookProduct(500);
		
		System.out.println("Normal Account:");
		n.bookProduct(500);
		
		System.out.println(p);
		System.out.println(n);
		

	}

}