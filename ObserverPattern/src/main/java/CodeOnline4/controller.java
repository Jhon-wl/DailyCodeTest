package CodeOnline4;

/**
 * Create by mr.wl on 2017/8/11
 */
public class controller {


    public String regist(String name,String password){
        if("admin".equals(name) && "123456".equals(password)){
            return  "success";
        }
        return "failed";
    }
}
