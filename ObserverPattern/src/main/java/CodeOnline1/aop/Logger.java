package CodeOnline1.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Create by mr.wl on 2017/8/7
 */
public class Logger {
    public void doLog(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
