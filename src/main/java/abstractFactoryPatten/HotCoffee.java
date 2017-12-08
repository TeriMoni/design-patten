package abstractFactoryPatten;

/**
 * @Description: 热咖啡
 * @author: liubin
 * @create: 2017-12-08 14:40
 **/
public class HotCoffee implements Coffee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotCoffee(String name) {
        this.name = name;
        System.out.println("热饮机，为您冲制了一杯热咖啡，名称："+name+" 价格(元)："+charge());
    }

    public int charge() {
        return 15;
    }
}
