package adapterPatten;

/**
 * @Description: 魅族手机
 * @author: liubin
 * @create: 2017-12-14 16:25
 **/
public class Meizu extends Phone implements Usb {

    private Adaptor adaptor;

    public Meizu(String brand,Adaptor adaptor) {
        this.brand = brand;
        this.adaptor = adaptor;
    }
    public void charge() {
        adaptor.convert(this);
        System.out.println(brand+"通过手机usb充电");
    }
}
