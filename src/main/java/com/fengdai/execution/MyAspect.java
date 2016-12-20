package com.fengdai.execution;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.fengdai.)")
	public void before(){  
	    System.out.println("【非常醒目 [方法调用前] 】");  
	}  
	
	@After("execution(* com.fengdai.)")
	public void after(){
		 System.out.println("【非常醒目 [方法调用后] 】");  
	}
	
	@AfterThrowing("execution(* com.fengdai.)")
	public void  afterThrowing(){
		System.out.println("【非常醒目 [方法异常后] 】");  
	}
	
}
