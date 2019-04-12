package com.nt.advice;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LoanApporvalAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String auditlogmssg=null;
		FileWriter fw=null;
		System.out.println("METHO DNAME:"+method.getName());
		System.out.println("object args"+Arrays.toString(args));
		System.out.println("Target method"+target.getClass());
		
		if(((Integer)args[2])<0){
			args[2]=((Integer)args[2])*-1;
		}
		//Generate audit Log message
		auditlogmssg=args[0]+":Loan Id Loan has come for approval with request amount:"+ args[2]+" to the manager"+args[1]+" on Date:: "+new Date()+"\n";
		//write message Audit Log file
		fw=new  FileWriter("E:/auditLog.txt",true);
		fw.write(auditlogmssg);
		fw.flush();
	fw.close();
		

	}

}
