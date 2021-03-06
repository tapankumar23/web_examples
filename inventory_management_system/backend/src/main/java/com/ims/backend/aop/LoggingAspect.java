package com.ims.backend.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.ims..*.*(..))")
	public void logBefore(JoinPoint joinPoint) { System.out.println("Class ~ Method :: "+joinPoint.getTarget().getClass().getName()+" ~ " + joinPoint.getSignature().getName()); }
}
