package dutyChainPatten;

/**
 * @Description: 直属上司对象
 * @author: liubin
 * @create: 2017-12-12 20:02
 **/
public class Superior extends Hander{

    @Override
    public void doRequset(int charge) {
        if(charge <1000){
            System.out.println("金额"+charge+"，直属上司批准通过");
        }else{
          if(getSuccessor() != null){
              getSuccessor().doRequset(charge);
          }
        }
    }
}
