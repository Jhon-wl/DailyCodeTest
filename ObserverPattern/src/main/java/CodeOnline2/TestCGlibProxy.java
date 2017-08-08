package CodeOnline2;


import org.springframework.cglib.proxy.Enhancer;

/**
 * Create by mr.wl on 2017/8/8
 */
public class TestCGlibProxy {
    public static void main(String[] args) {

        CGLibProxy proxy = new CGLibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(proxy);

        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.calName("zhanghang");

    }
}
