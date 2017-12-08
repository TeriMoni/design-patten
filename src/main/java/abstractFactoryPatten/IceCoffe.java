package abstractFactoryPatten;

/**
 * @Description: 冰咖啡
 * @author: liubin
 * @create: 2017-12-08 14:43
 **/
public class IceCoffe implements Coffee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IceCoffe(String name) {
        this.name = name;
        System.out.println("冷饮机，为您冲制了一杯冷咖啡，名称："+name+" 价格(元)："+charge());
    }

    public int charge() {
        return 19;
    }
}
