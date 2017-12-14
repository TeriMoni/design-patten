package adapterPatten;

/**
 * @Description: 小米手机
 * @author: liubin
 * @create: 2017-12-14 16:24
 **/
public class Xiaomi extends Phone implements Usb {

    public Xiaomi(String brand) {
        this.brand = brand;
    }

    public void charge() {
        System.out.println(brand+"通过手机usb充电");
    }
}
