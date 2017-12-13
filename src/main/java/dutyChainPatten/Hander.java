package dutyChainPatten;

/**
 * @Description: 抽象处理角色
 * @author: liubin
 * @create: 2017-12-12 19:59
 **/
public abstract class Hander {

    /**
     * 后续的责任对象的应用
     */
    private Hander successor;

    public Hander getSuccessor() {
        return successor;
    }

    public void setSuccessor(Hander successor) {
        this.successor = successor;
    }

    public abstract void doRequset(int charge);

}
