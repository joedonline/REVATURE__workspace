package com.revature.books.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger log = Logger.getLogger(LoggingAspect.class);

	/**
	 * Before all methods in the AuthorController, sysout the method signature
	 * 
	 * @param jp
	 */
	@Before(value = "within(com.revature.books.controllers.AuthorController)")
	public void sysoutMethods(JoinPoint jp) {
		System.out.println("Join Point signature: " + jp.getSignature());
	}

	/**
	 * 
	 * Before all methods, regardless of name or return
	 */
	@Before(value = "execution(* * (..))")
	public void sysoutMethodsTwo(JoinPoint jp) {
		sysoutMethods(jp);
	}

	@Before(value = "within(com.revature.books.*) && execution(* * (..))")
	public void logMethods(JoinPoint jp) {
		log.debug("Target: " + jp.getTarget() + ", Signature: " + jp.getSignature());
	}

	// Match out getAll methods in the service layer
	@Around("execution(* getAll())")
	public void interruptServiceFunctionality(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before pjp");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;
		} // lets the method call happen
		System.out.println("After pjp");
	}
	
	//
	@Around("execution(* * (..))")
	public Object monitorExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.nanoTime();
		long end;
		
		Object returned = null;
		
		try {
			returned = pjp.proceed();
			end = System.nanoTime();
			System.out.println("Execution time of " + pjp.getSignature() + ": " + (end-start));
		} catch (Exception e) {
			end = System.nanoTime();
			throw e;
		}
		
		return returned;
	}

}
