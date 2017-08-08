package CodeOnline2;

import net.sf.cglib.proxy.Callback;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/8
 */
public class CGLibProxy implements MethodInterceptor{

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("zhiqian"+method.getName());

        Object obj = methodProxy.invokeSuper(o,objects);

        System.out.println("zhihou"+method.getName());
        return null;
    }
}
