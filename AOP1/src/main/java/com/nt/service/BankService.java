package com.nt.service;

import java.util.Calendar;

public class BankService {
	
	public String approveloan(int loanID,String manager,int amount) {
		Calendar cal=null;
		int month=0;
		//get sys date ands time
		cal=Calendar.getInstance();
		//get current month
		month=cal.get(Calendar.MONTH);
		System.out.println("month");
		if((month>=5 && month<=9) && amount<=100000){
			return loanID +"loan is approved with "+amount +"by manager::"+manager;
		}
			else {
				return loanID +"loan is not approved with "+amount +"by manager::"+manager;
			}
		}//method
	}//class


