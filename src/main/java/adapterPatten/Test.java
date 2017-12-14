package adapterPatten;

/**
 * @Description:
 * @author: liubin
 * @create: 2017-12-14 16:38
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("对象适配模式");
        Usb huaeri = new Huawei("华为荣耀8");
        Adaptor adaptor = new Adaptor();
        huaeri.charge();
        Usb xiaomi = new Xiaomi("小米6s");
        xiaomi.charge();
        Usb meizu = new Meizu("魅族ix5",adaptor);
        meizu.charge();
        System.out.println("================================");
    }
}
