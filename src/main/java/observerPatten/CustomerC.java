package observerPatten;

/**
 * @Description: 订阅奶茶客户C
 * @author: liubin
 * @create: 2017-12-06 20:33
 **/
public class CustomerC implements ObserverDrag {
    // 观察者发布的信息
    private String message;

    private String userName;

    public CustomerC(String userName) {
        this.userName = userName;
    }

    public void update(SubjectDrag subject) {
        message =  ((MilkTeaShopDrag)subject).getMessage();
        System.out.println(message);
    }
}
