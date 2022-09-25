package com.P4;

public class Test {

	public static void main(String[] args) {
		
		 GenericBank hb = new HdfcBank();
		 GenericBank hb1 = new GenericBank();
		 hb1.welcome();
		 hb.welcome();
		 hb.deposit(300);
		 hb.deposit(200);
		 hb.withdraw(300);
		 hb.checkbalance();
		

	}

}
