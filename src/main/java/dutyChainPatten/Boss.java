package dutyChainPatten;

/**
 * @Description:
 * @author: liubin
 * @create: 2017-12-12 20:11
 **/
public class Boss extends Hander {

    @Override
    public void doRequset(int charge) {
        if(charge >=10000){
            System.out.println("金额"+charge+"，大老板批准通过");
        }else{
            if(getSuccessor() != null){
                getSuccessor().doRequset(charge);
            }
        }
    }
}
