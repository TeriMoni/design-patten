package observerPatten;

/**
 * @Description:
 * @author: liubin
 * @create: 2017-12-06 20:30
 **/
public class MilkTeaShopDrag extends SubjectDrag {

    private String teaName;

    private String shopName;

    public String getMessage() {
        return message;
    }

    private String message;

    public MilkTeaShopDrag(String shopName) {
        this.shopName = shopName;
    }

    public String getTeaName() {
        return teaName;
    }

    public void publishNewTea(String newTeaName){
        this.teaName = newTeaName;
        this.message = shopName + "新发布了一款新的奶茶:"+teaName;
        this.nodifyObservers();
    }

}
