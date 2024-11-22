package com.techsphere.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Log method entry
    @Before("execution(* com.techsphere.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        logger.info("Entering method: " + joinPoint.getSignature().getName() + 
                    " with arguments: " + joinPoint.getArgs());
    }

    // Log method exit (successful execution)
    @AfterReturning(pointcut = "execution(* com.techsphere.service.*.*(..))", returning = "result")
    public void logMethodExit(JoinPoint joinPoint, Object result) {
        logger.info("Exiting method: " + joinPoint.getSignature().getName() + 
                    " with result: " + result);
    }

    // Log method exit (on error/exception)
    @AfterThrowing(pointcut = "execution(* com.techsphere.service.*.*(..))", throwing = "exception")
    public void logMethodException(JoinPoint joinPoint, Throwable exception) {
        logger.error("Exception in method: " + joinPoint.getSignature().getName() + 
                     " with exception: " + exception.getMessage());
    }

    // Log method exit, regardless of success or failure
    @After("execution(* com.techsphere.service.*.*(..))")
    public void logAfterMethodExecution(JoinPoint joinPoint) {
        logger.info("Method execution completed: " + joinPoint.getSignature().getName());
    }
}
