package CodeOnline1.service;

import org.springframework.stereotype.Service;

/**
 * Create by mr.wl on 2017/8/7
 */
@Service("userService")
public class UserService implements UserServiceImpl {
    public void say(String value) {
        System.out.println(value);
    }
}
