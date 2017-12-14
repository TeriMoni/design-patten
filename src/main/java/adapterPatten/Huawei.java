package adapterPatten;

/**
 * @Description: 华为手机
 * @author: liubin
 * @create: 2017-12-14 16:23
 **/
public class Huawei extends Phone implements Usb {

    public Huawei(String brand) {
        this.brand = brand;
    }

    public void charge() {
        System.out.println(brand+"通过手机usb充电");
    }

}
