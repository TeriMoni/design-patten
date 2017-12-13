package dutyChainPatten;

/**
 * @Description:
 * @author: liubin
 * @create: 2017-12-12 20:12
 **/
public class Test {


    public static void main(String[] args) {
        Hander superior = new Superior();
        Hander departmentLeader = new DepartmentLeader();
        Hander boss = new Boss();
        boss.setSuccessor(departmentLeader);
        departmentLeader.setSuccessor(superior);
        boss.doRequset(100);
        boss.doRequset(2000);
        boss.doRequset(20000);
    }
}
