package org.sanmibuh.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspectImpl {

  @Pointcut("@annotation(myAspect)")
  public void methodsAnnotatedWithMyAspect(final MyAspect myAspect) {
    // defines pointcut for methods annotated with MyAspect
  }

  @Around(
      value = "execution(* *(..)) && methodsAnnotatedWithMyAspect(myAspect)",
      argNames = "joinPoint, myAspect"
  )
  public Object aroundAnnotatedMethods(final ProceedingJoinPoint joinPoint, final MyAspect myAspect) throws Throwable {
    try {
      System.out.println("BEFORE METHOD");
      return joinPoint.proceed();
    } finally {
      System.out.println("AFTER METHOD");
    }
  }

}
