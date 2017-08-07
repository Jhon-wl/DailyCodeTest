package CodeOnline1;

import CodeOnline1.controller.UserController;
import CodeOnline1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by mr.wl on 2017/8/7
 * 依赖注入实现
 */
public class TestDI {
    @Test
    public void  test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("./application-context.xml");
        UserFather user = context.getBean(UserFather.class);
//        System.out.println(user.getId());
//        System.out.println(user.getUser());

        UserController controller = context.getBean(UserController.class);
        UserService service = controller.getUserService();
        service.say("qqq");
    }
}
