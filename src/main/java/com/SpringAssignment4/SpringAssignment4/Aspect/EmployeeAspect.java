package com.SpringAssignment4.SpringAssignment4.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
       @Before("execution(* com.SpringAssignment4.SpringAssignment4.Controller.EmployeeController.getEmployees(..))")
       public void EmployeeBefore(JoinPoint joinPoint) {
              System.out.println("Before method: " + joinPoint.getSignature().getName());
       }
       @After("execution(* com.SpringAssignment4.SpringAssignment4.Controller.*.*(..))")
       public void EmployeeAfter(JoinPoint joinPoint) {
              System.out.println("After method: " + joinPoint.getSignature().getName());
       }
}
