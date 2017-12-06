package observerPatten;

/**
 * @Description: 拉模型观察者接口
 * @author: liubin
 * @create: 2017-12-06 20:24
 **/
public interface ObserverDrag {

    /**
     * 更新方法，通知 传入主题对象，直接获取主题对象的状态信息
     * @param subject
     */
    public void update(SubjectDrag subject);
}
