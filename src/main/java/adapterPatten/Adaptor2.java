package adapterPatten;

/**
 * @Description: 适配器转发器，内部实现通过nigix
 * @author: liubin
 * @create: 2017-12-14 17:24
 **/
public class Adaptor2 extends ClientB implements Server {

    public void pass(){
        System.out.print("ngix 转发请求 ！");
    }

    public void request() {
        pass();
        super.select();
    }
}
