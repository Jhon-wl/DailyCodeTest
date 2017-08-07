package CodeOnline1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Create by mr.wl on 2017/8/7
 */
@Component
@Aspect
public class UserAspect {
    @Pointcut(value = "execution(* CodeOnline1.service.UserService.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void doBefore(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object [] args = joinPoint.getArgs();
        System.out.println(name+ "  "+args.toString());
    }
    @After(value = "pointCut()")
    public void doAfter(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name);
    }
}
