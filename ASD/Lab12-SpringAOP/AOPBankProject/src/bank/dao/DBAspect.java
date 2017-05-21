package bank.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class DBAspect {


    @After("execution(* bank.dao.AccountDAO.*(..))")
    public void afterAdvice(JoinPoint joinpoint) {
        System.out.println("DB is accessed " + joinpoint.getSignature().getName());

    }

}
