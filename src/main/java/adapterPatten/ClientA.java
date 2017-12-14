package adapterPatten;

/**
 * @Description: 客户端A
 * @author: liubin
 * @create: 2017-12-14 17:22
 **/
public class ClientA implements Server {

    public void request() {
        System.out.println("客户端A，请求服务端");
    }
}
