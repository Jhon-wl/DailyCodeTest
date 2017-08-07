package CodeOnline1;

/**
 * Create by mr.wl on 2017/8/7
 */
public class User {
    private int id ;
    private String name;

    public User(){}
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
