package abstractFactoryPatten;

/**
 * @Description: 热奶茶
 * @author: liubin
 * @create: 2017-12-08 14:44
 **/
public class HotMikTea implements MilkTea {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotMikTea(String name) {
        this.name = name;
        System.out.println("热饮机，为您冲制了一杯热奶茶，名称："+name+" 价格(元)："+charge());
    }

    public int charge() {
        return 14;
    }
}
