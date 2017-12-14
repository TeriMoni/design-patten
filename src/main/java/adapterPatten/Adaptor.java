package adapterPatten;

/**
 * @Description: 适配器，usb转接线
 * @author: liubin
 * @create: 2017-12-14 16:26
 **/
public class Adaptor {

    public void convert(Phone phone){
        System.out.print(phone.brand+"通过usb转接线转换接口：");
    }
}
