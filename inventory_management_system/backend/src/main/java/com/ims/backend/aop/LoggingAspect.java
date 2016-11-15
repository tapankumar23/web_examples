package com.ims.backend.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.ims.backend.controllers.TestController.testing(..))")
	public void logBefore(JoinPoint joinPoint) { System.out.println("Starting execution :: "+joinPoint.getSignature().getName()+"("+joinPoint.getTarget().getClass().getName()+")"); }
	
	@After("execution(* com.ims.backend.controllers.*.*(..))")
	public void logAfter(JoinPoint joinPoint) { System.out.println("Ending execution :: "+joinPoint.getSignature().getName()+"("+joinPoint.getTarget().getClass().getName()+")\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");  }
	
	//@Pointcut("within(com.ims.backend.controllers.*)")
	//public void inServiceLayer(JoinPoint joinPoint) { System.out.println("Inside Service execution :: "+joinPoint.getSignature().getName()+"("+joinPoint.getTarget().getClass().getName()+")"); }
	
	/*@Around("execution(* com.ims.backend.controllers.*.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Class :: "+joinPoint.getSignature().getName());
		System.out.println("@@@@ BeforeExecution :: ("+joinPoint.getTarget().getClass().getName()+")");
		joinPoint.proceed(); //continue on the intercepted method
		System.out.println("@@@@ AfterExecution :: ("+joinPoint.getTarget().getClass().getName()+")"); 
	}*/
}