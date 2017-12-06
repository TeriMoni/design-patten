package observerPatten;

/**
 * @Description: 奶茶店，具体的主题对象
 * @author: liubin
 * @create: 2017-12-06 18:19
 **/
public class MilkTeaShop extends Subject {

    private String teaName;

    private String shopName;

    public MilkTeaShop(String shopName) {
        this.shopName = shopName;
    }

    public String getTeaName() {
        return teaName;
    }

    public void publishNewTea(String newTeaName){
        this.teaName = newTeaName;
        String message = shopName + "新发布了一款新的奶茶:"+teaName;
        this.nodifyObservers(message);
    }
}
