package observerPatten;

/**
 * @Description: 订阅奶茶客户A
 * @author: liubin
 * @create: 2017-12-06 19:53
 **/
public class CustomerA implements Observer {

    private String message;

    private String userName;

    public void update(String str) {
        message = str;
        System.out.println(userName+"收到" + message);
    }

    public CustomerA(String userName) {
        this.userName = userName;
    }

}
