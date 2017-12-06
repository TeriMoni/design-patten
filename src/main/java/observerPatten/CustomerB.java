package observerPatten;

/**
 * @Description: 订阅奶茶客户B
 * @author: liubin
 * @create: 2017-12-06 19:58
 **/
public class CustomerB implements Observer {

    private String message;

    private String userName;

    public void update(String str) {
        message = str;
        System.out.println(userName+ "收到" + message);
        subscibeTea();
    }

    public CustomerB(String userName) {
        this.userName = userName;
    }

    public void subscibeTea(){
        System.out.println(userName+"收到新品奶茶，立马去更新价格到商店");
    }
}
