package CodeOnline1.controller;

import CodeOnline1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Create by mr.wl on 2017/8/7
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
