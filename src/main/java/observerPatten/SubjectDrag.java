package observerPatten;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 拉模型的抽象主题对象
 * @author: liubin
 * @create: 2017-12-06 20:26
 **/
public abstract class SubjectDrag {

    /**
     * 保存被注册的观察者信息
     */
    private List<ObserverDrag> observerList = new ArrayList<ObserverDrag>();

    /**
     * 注册观察者
     * @param observer 观察者对象
     */
    public void addObserver(ObserverDrag observer){
        observerList.add(observer);
    }

    /**
     * 删除订阅的观察者
     * @param observer 观察者对象
     */
    public void deleteObserver(ObserverDrag observer){
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void nodifyObservers(){
        for (ObserverDrag observer : observerList) {
            observer.update(this);
        }
    }
}
