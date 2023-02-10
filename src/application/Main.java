package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Vini1", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		//Sobreposição do Método withdraw
		SavingsAccount sa = new SavingsAccount(1002, "Vini", 1000.0, 0.01);
		sa.withdraw(200.0);
		System.out.println(sa.getBalance());
		
		//Sobreposição utilizando super
		BusinessAcount ba = new BusinessAcount(1003, "Vini", 1000.0, 0.01);
		ba.withdraw(200.0);
		System.out.println(ba.getBalance());
		
	}

}
