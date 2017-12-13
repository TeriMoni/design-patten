package dutyChainPatten;

/**
 * @Description: 部门领导
 * @author: liubin
 * @create: 2017-12-12 20:09
 **/
public class DepartmentLeader extends Hander {

    @Override
    public void doRequset(int charge) {
        if(charge<10000 && charge>1000){
            System.out.println("金额"+charge+"，部门领导批准通过");
        }else{
            if(getSuccessor() != null){
                getSuccessor().doRequset(charge);
            }
        }
    }
}
