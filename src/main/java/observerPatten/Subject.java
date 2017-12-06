package observerPatten;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 抽象主题类
 * @author: liubin
 * @create: 2017-12-06 18:11
 **/
public abstract class Subject {

    /**
     * 保存被注册的观察者信息
     */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 注册观察者
     * @param observer 观察者对象
     */
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    /**
     * 删除订阅的观察者
     * @param observer 观察者对象
     */
    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     * @param message 更新的信息
     */
    public void nodifyObservers(String message){
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
