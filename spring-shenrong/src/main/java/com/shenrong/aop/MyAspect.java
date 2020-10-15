package com.shenrong.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.shenrong.service..*.*(..))")
	public void myPointCut() {

	}

	@Before("myPointCut()")
	public void myBeforeAdvice() {
		System.out.println("Before advice");
	}

	@After("myPointCut()")
	public void myAfterAdvice() {
		System.out.println("after advice");
	}

}
