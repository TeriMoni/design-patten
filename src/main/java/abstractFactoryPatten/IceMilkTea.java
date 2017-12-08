package abstractFactoryPatten;

/**
 * @Description: 冰奶茶
 * @author: liubin
 * @create: 2017-12-08 14:44
 **/
public class IceMilkTea implements MilkTea {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IceMilkTea(String name) {
        this.name = name;
        System.out.println("冷饮机，为您冲制了一杯冷奶茶，名称："+name+" 价格(元)："+charge());
    }

    public int charge() {
        return 15;
    }
}
