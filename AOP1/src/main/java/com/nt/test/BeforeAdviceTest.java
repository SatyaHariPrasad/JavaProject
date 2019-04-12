package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		proxy=ctx.getBean("pfb",BankService.class);
		//invoke the method
		System.out.println(proxy.approveloan(1001, "raja",80000));

		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//method

	
	
}//class
