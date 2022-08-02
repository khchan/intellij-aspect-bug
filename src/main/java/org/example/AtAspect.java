package org.example;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AtAspect {

    @AfterReturning("execution(* *.test(..))")
    public void after() {
        System.out.println("aspect setting static variable to true!");

        App.atAspectj = true;
    }
}
