package observerPatten;

/**
 * @Description:观察者接口
 * @author: liubin
 * @create: 2017-12-06 18:07
 **/
public interface Observer {

    /**
     * 更新方法，通知
     * @param messsage
     */
    public void update(String messsage);

}
