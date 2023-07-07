package com.viettran.springaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
    @Pointcut("execution(* com.viettran.springaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig() {
    }

    @Pointcut("execution(* com.viettran.springaop.aopexample.business.*.*(..))")
    public void businessPackageConfig() {
    }

    @Pointcut("execution(* com.viettran.springaop.aopexample.data.*.*(..))")
    public void dataPackageConfig() {
    }

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {
    }

    @Pointcut("@annotation(com.viettran.springaop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation() {
    }
}
